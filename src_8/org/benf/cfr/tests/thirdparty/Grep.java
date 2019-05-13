package org.benf.cfr.tests.thirdparty;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2013
 * Time: 07:05
 */
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Grep prints lines matching a regex.  See printUsageAndExit(...) method to run from command line.
 * This sample shows examples of using next features:
 * 1. Lambda and bulk operations. Working with streams: map(...),filter(...),flatMap(...),limit(...) methods.
 * 2. Static method reference for printing values.
 * 3. New Collections API forEach(...) method.
 * 4. Try-with-resources feature.
 * 5. new Files.walk(...), Files.lines(...) API.
 * 6. Closeable streams.
 */
public class Grep {

    private static void printUsageAndExit(String... str) {
        System.out.println("Usage: " + Grep.class.getSimpleName() + " [OPTION]... PATTERN FILE...");
        System.out.println("Search for PATTERN in each FILE. If FILE is a directory then whole file tree of the directory will be processed.");
        System.out.println("Example: grep -m 100 'hello world' menu.h main.c");
        System.out.println("Options:");
        System.out.println("    -m NUM: stop analysis after NUM matches");
        Arrays.asList(str).forEach(System.out::println);
        System.exit(1);
    }

    public static void main(String[] args) throws IOException {
        Pattern pattern;
        long maxCount = Long.MAX_VALUE;
        if (args.length < 2) printUsageAndExit();
        try {
            int i = 0;
            //parse OPTIONS
            while (args[i].startsWith("-")) {
                switch (args[i]) {
                    case "-m":
                        maxCount = Long.parseLong(args[++i]);
                        break;
                    default:
                        printUsageAndExit("Unexpected option " + args[i]);
                }
                i++;
            }
            //parse PATTERN
            pattern = Pattern.compile(args[i++]);
            if (i == args.length) printUsageAndExit("There are no files for input");

            List<Stream<String>> files = Arrays.stream(args, i, args.length)
                    .map(Paths::get)
                    .flatMap(Grep::getPathStream)
                    .filter(Files::isRegularFile)
                    .map(Grep::path2Lines).collect(Collectors.toList());
            files.stream().flatMap(file -> file)
                    .filter(pattern.asPredicate())
                    .limit(maxCount)
                    .forEach(System.out::println);
            files.forEach(Stream::close);
        } catch (Exception ex) {
            printUsageAndExit(ex.toString());
        }
    }

    /**
     * Flattens file system hierarchy into a stream. This code is not inlined
     * for the reason of Files.walk() throwing a checked IOException that must be caught.
     *
     * @param path - the file or directory
     * @return Whole file tree starting from path, a stream with one element - the path itself - if it is a file.
     */
    private static Stream<Path> getPathStream(Path path) {
        try (Stream<Path> paths = Files.walk(path)) {
            return paths.collect(Collectors.<Path>toList()).stream();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * Reads content of a file into a stream. The result is a closeable stream in order to close it later.
     * This code is not inlined
     * for the reason of Files.lines() throwing a checked IOException that must be caught.
     *
     * @param path - the file to read
     */

    private static Stream<String> path2Lines(Path path) {
        try {
            return Files.lines(path, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
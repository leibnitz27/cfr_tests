package org.benf.cfr.tests;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2013
 * Time: 07:26
 */
public class UsingTest1 {
    private static Stream<Path> getPathStream(Path path) {
        try (Stream<Path> paths = Files.walk(path)) {
            return paths.collect(Collectors.<Path>toList()).stream();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

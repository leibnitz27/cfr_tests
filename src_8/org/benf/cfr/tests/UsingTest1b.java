package org.benf.cfr.tests;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2013
 * Time: 07:26
 */
public class UsingTest1b {
    private static void getPathStream(Path path) {
        try (Stream<Path> paths = null) {
            System.out.println("TEST" + paths);
        } catch (RuntimeException e) {
            throw e;
        }
    }
}

package org.benf.cfr.tests;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

public class IntersectionReturnTest1 {
    @SuppressWarnings("unchecked")
    private static <T extends Closeable & Iterator<String>>
    T createCloseableIterator() {
        return (T) new Scanner(System.in);
    }
}

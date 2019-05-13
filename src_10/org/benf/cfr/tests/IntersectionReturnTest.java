package org.benf.cfr.tests;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

public class IntersectionReturnTest {
    @SuppressWarnings("unchecked")
    private static <T extends Closeable & Iterator<String>>
    T createCloseableIterator(boolean empty) {
        if (empty)
            return (T) new Empty();
        else
            return (T) new Scanner(System.in);
    }


    private static <E, T extends Closeable & Iterator<E>>
    Optional<E> firstMatch(T elements, Predicate<? super E> condition)
            throws IOException {
        try (elements) {
            while (elements.hasNext()) {
                E e = elements.next();
                if (condition.test(e)) return Optional.of(e);
            }
        }
        return Optional.empty();
    }

    private static void readAndPrint(boolean empty) throws IOException {
        var elements = createCloseableIterator(empty);
        Optional<String> dollarWord =
                firstMatch(elements, s -> s.startsWith("$"));
        System.out.println(dollarWord);
    }

    public static void main(String ... args) throws IOException {
        readAndPrint(true);
        readAndPrint(false);
    }
}

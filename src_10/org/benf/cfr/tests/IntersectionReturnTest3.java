package org.benf.cfr.tests;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Predicate;

public class IntersectionReturnTest3 {
    private static <E, T extends Iterator<E> & Closeable>
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
}

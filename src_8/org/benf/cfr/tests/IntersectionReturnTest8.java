package org.benf.cfr.tests;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.function.Predicate;

public class IntersectionReturnTest8 {
    private static <E, T extends Iterator<E>>
    E firstMatch(T elements, Predicate<? super E> condition) {
            while (elements.hasNext()) {
                E e = elements.next();
                if (condition.test(e)) return e;
            }
        return null;
    }
}

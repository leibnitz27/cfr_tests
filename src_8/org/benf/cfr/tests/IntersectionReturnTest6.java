package org.benf.cfr.tests;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Predicate;

public class IntersectionReturnTest6 {
    private static <E, T extends Iterator<E> & Closeable>
    E firstMatch(T elements ) {
                E e = elements.next();
                return e;
    }
}

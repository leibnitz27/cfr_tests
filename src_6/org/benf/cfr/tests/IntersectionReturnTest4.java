package org.benf.cfr.tests;

import java.util.Iterator;

public class IntersectionReturnTest4 {
    private static <X, T extends Iterator<X>>
    X firstMatch(T elements) {
                X e = elements.next();
                return e;
    }
}

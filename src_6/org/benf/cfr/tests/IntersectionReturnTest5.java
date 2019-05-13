package org.benf.cfr.tests;

import java.util.Iterator;

public class IntersectionReturnTest5 {
    private static <X>
    X firstMatch(Iterator<X> elements) {
                X e = elements.next();
                return e;
    }
}

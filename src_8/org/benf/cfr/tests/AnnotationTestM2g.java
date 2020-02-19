package org.benf.cfr.tests;

import java.util.List;

class AnnotationTestM2d2 {
    static class Nested<T extends List, A> {
        public String test2(Nested<@MyParam T, @MyParam2 A> b, @MyParam2 Nested<@MyParam3 T, @MyParam A> c, @MyParam3 int d) {
            return null;
        }
    }
}
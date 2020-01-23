package org.benf.cfr.tests;

import java.util.List;

class AnnotationTestM2e {
    static class Nested<T extends List, A> {
        public String test2(Nested<T, A> c) throws @MyParam2 Exception, @MyParam3 IndexOutOfBoundsException {
            return null;
        }
    }
}
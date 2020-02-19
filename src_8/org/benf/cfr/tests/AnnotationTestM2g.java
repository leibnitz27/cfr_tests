package org.benf.cfr.tests;

import java.util.List;

class AnnotationTestM2g {
    static class Outer {
        static class Nested<T extends List, A> {
            public String test2(Nested<@MyParam T, @MyParam2 A> b, org.benf.cfr.tests.Nested<@MyParam A, @MyParam2 T> c) {
                return null;
            }
        }
    }

    public <T extends List, A> String test2(Nested<@MyParam T, @MyParam2 A> b, Outer.Nested<@MyParam T, @MyParam2 A> c) {
        return null;
    }

}
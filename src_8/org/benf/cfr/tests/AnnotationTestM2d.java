package org.benf.cfr.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Set;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

class AnnotationTestM2d {
    static class Nested<T extends @MyParam2 List, A> {
        public @MyParam3 String test2(@MyParam3 Nested<@MyParam3 T, @MyParam A> this, Nested<@MyParam T, @MyParam2 A> b, Nested<@MyParam T, @MyParam2 A> c) throws @MyParam2 Exception, @MyParam3 IndexOutOfBoundsException {
            return null;
        }
    }
}
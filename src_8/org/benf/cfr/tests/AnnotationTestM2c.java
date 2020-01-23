package org.benf.cfr.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

class AnnotationTestM2c {
    static class Nested<T, A> {
        public String test2(Nested<@MyParam T, @MyParam A> this, String b) throws Exception {
            return null;
        }
    }
}
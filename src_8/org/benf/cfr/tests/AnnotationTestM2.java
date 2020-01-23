package org.benf.cfr.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

class AnnotationTestM2 {
    @MyParam
    static class Nested<@MyParam T> {
        public @MyParam String test(@MyParam Nested<T> this, @MyParam String t) throws @MyParam Exception {
            return null;
        }
    }
}
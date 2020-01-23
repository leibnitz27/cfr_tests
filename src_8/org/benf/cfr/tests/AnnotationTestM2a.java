package org.benf.cfr.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

class AnnotationTestM2a {
    static class Nested<T> {
        public String test2(@MyParam Nested<T> this, String t) throws Exception {
            return null;
        }
    }
}
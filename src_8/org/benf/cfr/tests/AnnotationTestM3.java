package org.benf.cfr.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

class AnnotationTestM3 {
    class Inner {
        // Outer class receiver type
        public Inner(@MyParam AnnotationTestM3 AnnotationTestM3.this) { }
    }
}
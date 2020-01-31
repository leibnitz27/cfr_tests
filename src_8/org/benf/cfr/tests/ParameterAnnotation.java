package org.benf.cfr.tests;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

class ParameterAnnotation {
    @Retention(RUNTIME)
    @Target({ElementType.PARAMETER})
    @interface MyParam { }

    @Retention(RUNTIME)
    @Target({ElementType.TYPE_USE})
    @interface TypeUse { }

    void test(@MyParam int i) throws Exception { }

    void test(@MyParam long i) throws @TypeUse Exception { }
}
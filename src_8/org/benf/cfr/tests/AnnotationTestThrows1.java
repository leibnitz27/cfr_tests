package org.benf.cfr.tests;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class AnnotationTestThrows1 {
    @Retention(RUNTIME)
    @Target({ElementType.TYPE_USE})
    @interface TypeUse { }

    @Retention(RUNTIME)
    @Target({ElementType.TYPE_USE})
    @interface TypeUse2 { }

    public void test() throws @TypeUse @TypeUse2 Exception {}
}

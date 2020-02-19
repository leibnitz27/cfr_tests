package org.benf.cfr.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.List;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

class AnnotationTestM1 {
    @MyField
    public @MyParam int field;

    @MyField
    public @MyParam List<@MyParam2 Integer> field2;
}
package org.benf.cfr.tests;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

class TypeUse {
    @Retention(RUNTIME)
    @Target({ElementType.TYPE_USE})
    @interface MyParam { }

    @MyParam
    TypeUse() { }
}
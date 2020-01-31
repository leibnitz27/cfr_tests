package org.benf.cfr.tests;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

class DeclarationAndTypeUseAnnotations {
    @Retention(RUNTIME)
    @Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.TYPE_USE})
    @interface MyParam { }

    static class Test {
        @MyParam
        Test() { }

        @MyParam
        String field;

        @MyParam
        String test(@MyParam int i) {
            return null;
        }
    }
}
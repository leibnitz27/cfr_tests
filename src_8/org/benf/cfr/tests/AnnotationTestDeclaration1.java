package org.benf.cfr.tests;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class AnnotationTestDeclaration1 {
    @Retention(RUNTIME)
    @Target({ElementType.PARAMETER})
    @interface Parameter { }

    static class A {
        static class B {
            class C {
                void test(@Parameter C c, C c2) { }
            }
        }
    }
}

package org.benf.cfr.tests;

public class AnnotationTestInnerDisplay {
    class A {
        class B {
            class C {
                @MyField C f;
            }
        }
    }
}

package org.benf.cfr.tests;

public class NestedInnerClasses2 {
    private String str;

    class A {
        class B {
            class C {
                class D {
                    String doSomething() {
                        return str;
                    }
                }
            }
        }
    }
}
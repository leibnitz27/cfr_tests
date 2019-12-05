package org.benf.cfr.tests;

public class NestedInnerClasses {
    private String str;

    class A {
        class B {
            String doSomething() {
                return str;
            }
        }
    }
}
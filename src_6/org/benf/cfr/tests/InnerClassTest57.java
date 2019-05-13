package org.benf.cfr.tests;

public class InnerClassTest57 {
    public void get() {
        final int f = 0;
        new Object() {
            int g;
            class Foo {
                public Foo() {
                    g = f;
                }
            }
        };
    }
}

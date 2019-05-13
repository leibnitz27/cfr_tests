package org.benf.cfr.tests;

public class InnerClassTest55 {
    public void get() {
        new Object() {
            int f = 0;
            class Foo {
                public Foo() {
                    f++;
                }
            }
        };
    }
}

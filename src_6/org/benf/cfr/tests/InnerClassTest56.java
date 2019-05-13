package org.benf.cfr.tests;

public class InnerClassTest56 {
    int f = 0;
    public void get() {
        new Object() {
            int f = 0;
            class Foo {
                public Foo() {
                    InnerClassTest56.this.f++;
                }
            }
        };
    }
}

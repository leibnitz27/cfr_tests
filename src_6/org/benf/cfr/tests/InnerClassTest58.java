package org.benf.cfr.tests;

public class InnerClassTest58 {
    public void get() {
        int f = 0;
        new Object() {
            class Foo {
                int f;
                public Foo(int f) {
                    this.f = f;
                }
            }
        };
    }
}

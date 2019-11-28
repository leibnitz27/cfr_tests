package org.benf.cfr.tests;

public class InnerClassTest60 {

    private interface Bip {

    }

    private static class Foo {
        Bip getBip() {
            return null;
        }
    }

    public static Foo runner(final Bip runner) {
        return new Foo() {
            public Bip getBip() {
                return runner;
            }
        };
    }
}

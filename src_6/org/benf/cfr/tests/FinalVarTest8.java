package org.benf.cfr.tests;

public class FinalVarTest8 {
    public static final String h1 = "Hello";

    public void foo() {
        System.out.println(Foo.h2.equals(h1));
    }

    public static class Foo {
        public static final String h2 = "Chap";
        public void thing() {
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h2.equals(h1));
        }
    }
}

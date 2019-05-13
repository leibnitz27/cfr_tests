package org.benf.cfr.tests;


public class ShortNameTest5 {

    public class Foo {
    }

    void test() {
        class Foo {
            ShortNameTest5.Foo foo3;

        };

        Foo x = new Foo();
    }
}

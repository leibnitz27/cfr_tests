package org.benf.cfr.tests;

public class ShortNameTest4 {
    private org.benf.cfr.tests.pack1.ShortNameTest4 foo1;
    Foo foo;

    private class Foo {
        private org.benf.cfr.tests.pack2.Foo foo2;

        void test() {
            Foo foo = new Foo();
        }
    }

    void test() {
        class Foo {
            org.benf.cfr.tests.pack1.Foo foo1;
            org.benf.cfr.tests.pack2.Foo foo2;
            ShortNameTest4.Foo foo3;

        };

        Foo x = new Foo();
    }
}

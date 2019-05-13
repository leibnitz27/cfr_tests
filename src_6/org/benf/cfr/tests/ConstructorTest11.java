package org.benf.cfr.tests;

public class ConstructorTest11 {
    private static class Foo
    {
        public Foo(int x){
        }

        void bar() {}
    }

    private Foo bob = new Foo(3) {
        {
            bar();
            bar();
        }};
}

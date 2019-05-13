package org.benf.cfr.tests;

import java.util.Arrays;

public abstract class IncrTest8f {

    public static class Foo {
        private final int x;

        public Foo(int x) {
            this.x = x;
        }

        public void foo(int y, int z) {
            System.out.println("" + x + "," + y + "," + z);
        }
    }

    public static void main(String ... args) {
        Foo f[] = new Foo[] {new Foo(0), new Foo(1), new Foo(2), new Foo(3), new Foo(4)};
        int i = 1;
        f[++i].foo(++i, ++i);
        i=1;
        f[i++].foo(i++, ++i);
    }
}

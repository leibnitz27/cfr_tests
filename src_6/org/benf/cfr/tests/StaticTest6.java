package org.benf.cfr.tests;

public class StaticTest6 {
    static class Test2 {
        final Test2 a = this;
        static int PINEAPPLE = 123;
        static int random() { return 4; }
    }

    static class Test2b extends Test2 {
        static int PINEAPPLE = 0;
        final Test2b b = this;
    }

    static class Test2s {
        int test2a(Test2 a) {
            return a.a.random();
        }

        int test2b(Test2 a) {
            return a.a.PINEAPPLE;
        }

        int test2c(Test2b b) {
            return b.b.random();
        }

        int test2d(Test2b b) {
            return ((Test2)b.b).random();
        }
    }
}

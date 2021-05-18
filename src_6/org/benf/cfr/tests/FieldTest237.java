package org.benf.cfr.tests;

public class FieldTest237 {
    static class Test1 {
        final int eight = 8;
    }

    static class Test1s {
        int test1a(Test1 a) {
            return a.eight;
        }

        double test1b(Test1 a) {
            return a.eight * 2.5 + Math.sin(a.eight+1) * 8;
        }

        double test1c(Test1 a) {
            a.getClass();
            a.getClass();
            return 8.0 * 2.5 + Math.sin(8.0+1) * 8;
        }
    }
}

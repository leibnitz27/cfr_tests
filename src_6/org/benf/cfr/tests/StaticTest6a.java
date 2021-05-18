package org.benf.cfr.tests;

public class StaticTest6a {
    static class Test2s {
        int test2d(StaticTest6.Test2b b) {
            return ((StaticTest6.Test2)b.b).random();
        }
    }
}

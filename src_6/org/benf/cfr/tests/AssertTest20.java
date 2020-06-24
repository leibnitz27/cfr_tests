package org.benf.cfr.tests;


class AssertTest20 {

    public static void f(Integer x) {
        if (x > 1 || x < -10) {
            assert (x!=3);
        }
    }
}
package org.benf.cfr.tests;

public class EffectingBugTest {
    public static void test(int[] x, int i) {
        x[foo(i)] += i;
    }

    public static int foo(int i) {
        return i;
    }
}

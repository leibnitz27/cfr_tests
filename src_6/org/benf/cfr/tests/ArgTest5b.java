package org.benf.cfr.tests;

public class ArgTest5b {
    public ArgTest5b(int a, String b, int[] c, Object d) {
    }

    public static void test() {
        int [] intarr = null;
        Object x = new ArgTest5b(1, "Hello", intarr, intarr);
    }
}

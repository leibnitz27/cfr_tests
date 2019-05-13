package org.benf.cfr.tests;

public class ArgTest5 {
    public ArgTest5(int a, String b, int[] c, Object d) {
    }

    public static void test() {
        int [] intarr = null;
        Object x = new ArgTest5(1, "Hello", intarr, null);
    }
}

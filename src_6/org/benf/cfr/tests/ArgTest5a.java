package org.benf.cfr.tests;

public class ArgTest5a {
    public static Object test(int a, String b, int[] c, Object d) {
        return a;
    }

    public static void test() {
        int [] intarr = null;
        Object x = test(1, "Hello", intarr, null);
    }
}

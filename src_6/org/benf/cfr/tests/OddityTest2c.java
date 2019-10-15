package org.benf.cfr.tests;

public class OddityTest2c {
    public static void a(boolean x) {
        int[] a = new int[] {4};
        int[] b = new int[] {3};
        (x?a:b)[0] = (x?b:a)[0] + (x?b:a)[0];
        System.out.println("a " + a[0] + " b" + b[0]);
    }
}

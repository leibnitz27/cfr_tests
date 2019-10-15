package org.benf.cfr.tests;

public class OddityTest2a {
    public static void b(boolean x) {
        int[] a = new int[] {4};
        int[] b = new int[] {4};
        int[] c= x?a:b;
        c[0] *= 2;
        c[0] *= 2;
        b[0] *= 2;
        a[0] *= 2;
        c[0] *= 2;
        c = x?b:a;
        c[0] *= 2;
        c[0] *= 2;
        b[0] *= 2;
        a[0] *= 2;
        c[0] *= 2;
    }
}

package org.benf.cfr.tests;

public class OddityTest2b {
    // Fernflower screws this one up *COMPLETELY* :)
    public static void a(boolean x) {
        int[] a = new int[] {4};
        int[] b = new int[] {3};
        int[] c = a;
        c[0] = (c = x?b:a)[0] + c[0];
        System.out.println("a " + a[0] + " b" + b[0]);
    }

    public static void b(boolean x) {
        int[] c;
        int[] a = new int[]{4};
        int[] b = new int[]{3};
        int[] arrn = c = a;
        c = x ? b : a;
        arrn[0] = c[0] + c[0];
        System.out.println("a " + a[0] + " b" + b[0]);
    }

    public static void main(String ... s) {
        a(true);
        b(true);
    }
}

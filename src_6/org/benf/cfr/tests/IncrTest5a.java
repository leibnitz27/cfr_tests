package org.benf.cfr.tests;

/**
 * Test courtesy of Hans Juergen Grote Graf
 */
public class IncrTest5a {
    public static void t1() {
        int a = 0;
        testParam(testParam(a++, ++a), testParam(++a,a++));
    }

    private static int testParam(int a, int b) {
        System.out.println(""+a+","+b);return a+b;
    }
}

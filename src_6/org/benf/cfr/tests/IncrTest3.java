package org.benf.cfr.tests;

/**
 * Test courtesy of Hans Juergen Grote Graf
 */
public class IncrTest3 {
    public static void main(String ... args) {
        int a = 0;
        testParam(a, a++);
        testParam(++a, a++);
        testParam(++a);
    }

    private static void testParam(int a) {
        System.out.println(""+a);
    }

    private static void testParam(int a, int b) {
        System.out.println(""+a+","+b);
    }
}

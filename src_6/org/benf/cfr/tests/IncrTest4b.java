package org.benf.cfr.tests;

/**
 * Test courtesy of Hans Juergen Grote Graf
 */
public class IncrTest4b {
    public static void main(String ... args) {
        int a = 0;
        testParam(a++,a++,a++,a++,a++,a++,a++);
    }

    private static void testParam(int ... x) {
    }
}

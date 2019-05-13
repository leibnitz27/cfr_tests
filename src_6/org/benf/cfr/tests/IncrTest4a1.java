package org.benf.cfr.tests;

/**
 * Test courtesy of Hans Juergen Grote Graf
 */
public class IncrTest4a1 {
    public static void main(String ... args) {
        int a = 0;
//        testParam(++a,a++,++a);      // 1 1 3
        testParam(++a,++a);      // 4 5 5
    }

    private static void testParam(int a, int b) {
    }
}

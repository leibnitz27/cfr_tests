package org.benf.cfr.tests;

/**
 * Test courtesy of Hans Juergen Grote Graf
 */
public class IncrTest4 {
    public static void main(String ... args) {
        int a = 0;
        testParam(++a,a++,++a);      // 1 1 3
        testParam(++a,++a,a++);      // 4 5 5
        testParam(++a);              // 7
    }

    private static int testParam(int a) {
        System.out.println(""+a); return a;
    }

    private static int testParam(int a, int b) {
        System.out.println(""+a+","+b);return a+b;
    }

    private static int testParam(int a, int b, int c) {
        System.out.println(""+a+","+b+","+c);
        return a+b+c;
    }
}

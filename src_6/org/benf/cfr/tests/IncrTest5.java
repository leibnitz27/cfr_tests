package org.benf.cfr.tests;

/**
 * Test courtesy of Hans Juergen Grote Graf
 */
public class IncrTest5 {
    public static void main(String ... args) {
        int a = 0;
        testParam(a++);
        testParam(++a);
        testParam(a++,a++);
        testParam(a++,++a);
        testParam(++a,a++);
        testParam(++a,++a);
        testParam(a++,a++,a++);
        testParam(a++,a++,++a);
        testParam(a++,++a,a++);
        testParam(a++,++a,++a);
        testParam(++a,a++,a++);
        testParam(++a,a++,++a);
        testParam(++a,++a,a++);
        testParam(++a,++a,++a);
        testParam(testParam(a++, ++a, testParam(a++,++a)));
        testParam(testParam(a++, ++a, testParam(++a,a++)));
        testParam(testParam(a++, ++a), testParam(++a,a++));
        testParam(testParam(a++), ++a , testParam(a++,++a));
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

package org.benf.cfr.tests;

public class NarrowingTest2 {
    static void test(short a) {
        System.out.println(a);
    }

    public static void main(String ... args) {
        test((byte)300);
    }
}

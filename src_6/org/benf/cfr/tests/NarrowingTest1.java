package org.benf.cfr.tests;

public class NarrowingTest1 {
    void test(byte a) {
        System.out.println(a);
    }

    void test2() {
        test((byte)1);
    }
}

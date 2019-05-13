package org.benf.cfr.tests;

public class NarrowingTest3 {
    void test(short a) {
        System.out.println(a);
    }

    void test2() {
        test((short)1);
    }
}

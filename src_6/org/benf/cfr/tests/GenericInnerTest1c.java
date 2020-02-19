package org.benf.cfr.tests;

// Inspired by Issue #118 - not yet fixed.
public class GenericInnerTest1c {

    void test2(GenericInnerTest1<Integer>.Inner x) {
        Integer iv = x.getOuterT();
    }

    void test() {
        GenericInnerTest1<Integer> x = new GenericInnerTest1<Integer>();
        test2(x.test());
    }
}

package org.benf.cfr.tests;

public class TypeTest21b {

    private int shortFn(short x) {
        return x;
    }

    public void test3(boolean b1) {
        short s = b1 ? (short)1 : 0;
        short s1 = (short)(b1 ? 1 : 0);
        short s2 = (short)shortFn(s);
        int i1 = shortFn(s2);
    }
}

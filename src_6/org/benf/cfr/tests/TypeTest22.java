package org.benf.cfr.tests;

public class TypeTest22 {

    private int shortFn(short x) {
        return x;
    }

    private int i;

    public void test3(short s2) {
        i = shortFn(s2);
    }
}

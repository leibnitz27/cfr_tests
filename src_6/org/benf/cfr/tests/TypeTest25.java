package org.benf.cfr.tests;

public class TypeTest25 {

    public void f1(short s) {
    }

    public void f1(int i) {
    }

    void test(short s, int i) {
        f1(s);
        f1((int)s);
        f1(i);
        f1((short)i);
    }
}

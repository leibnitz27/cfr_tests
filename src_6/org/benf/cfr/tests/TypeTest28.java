package org.benf.cfr.tests;

public class TypeTest28 {

    public void x(int i) {
    }

    public void x(short s) {
    }

    public void test() {
        short t = 34;
        x(t);
        x((int)t);
    }

}

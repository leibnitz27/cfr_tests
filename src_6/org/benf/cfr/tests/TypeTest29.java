package org.benf.cfr.tests;

public class TypeTest29 {

    public void x(int[] i) {
    }

    public void x(short[] s) {
    }

    public void test() {
        short[] t = {34};
        x(t);
        int[] t2 = {34};
        x(t2);
    }

}

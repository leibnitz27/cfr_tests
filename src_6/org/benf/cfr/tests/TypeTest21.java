package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypeTest21 {

    private int shortFn(short x) {
        return x;
    }

    public void test3(boolean b1) {
        short s = b1 ? (short)1 : 0;
        short s2 = (short)shortFn(s);
        int i1 = shortFn(s2);
    }
}

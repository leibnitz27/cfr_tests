package org.benf.cfr.tests;

public class LoopTest81 {
    public static void foo(char [] carray) {
        int l = carray.length;
        --l;
        for (int i=0;i<l;++i) {
            System.out.println(0);
        }
    }
}

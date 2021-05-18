package org.benf.cfr.tests;

public class LoopTest80 {
    public static void foo(char [] carray, int idx) {
        ++idx;
        while (carray[idx] == 'a') {
            System.out.println(0);
        }
    }
}

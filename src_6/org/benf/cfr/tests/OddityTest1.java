package org.benf.cfr.tests;

public class OddityTest1 {
    public static int a() {
        int a = 4;
        a *= 2;
        a *= 2;
        a *= 2;
        if(a < 7) return 1;
        else return 0;
    }
}

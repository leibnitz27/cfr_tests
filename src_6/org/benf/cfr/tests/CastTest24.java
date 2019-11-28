package org.benf.cfr.tests;

public class CastTest24 {
    float test1(boolean b) {
        return b ? 1 : 0;
    }
    int test2(boolean b) {
        return b ? 1 : 0;
    }
    short test3(boolean b) {
        return b ? (short)1 : 0;
    }
    long test4(boolean b) {
        return b ? 1 : 0;
    }
    byte test5(boolean b) {
        return b ? (byte)1 : 0;
    }
}

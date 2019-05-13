package org.benf.cfr.tests;

public class TernaryTest10 {
    private short s;
    private int i;
    private long l;
    private byte b;
    private boolean bl;

    public void test3(boolean a) {
        b = (byte)(a?1:0);
        i = (int)(a?1:0);
        l = (a?1:0);
        s = (short)(a?1:0);
        bl = (a);
    }
}

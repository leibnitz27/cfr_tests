package org.benf.cfr.tests;

public class TernaryTest10c {
    private byte b;

    public void test3(boolean a) {
        b = (byte)(int)(a?(Integer)1:(Integer)0);
    }
}

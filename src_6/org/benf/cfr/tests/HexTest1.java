package org.benf.cfr.tests;

public class HexTest1 {
    public long foo(long x) {
        x &= 0xff;
        x = x & -983041;
        x = x & 0xfff0ffff;
        x = x & 0xFFFFFFFFFFF0FFFFL;
        x = x & 0xFF0FFFFFFFF0FFFFL;
        x |= 0xae00ae;
        x = 0xae0fff0 | x;
        return x;
    }

    public long foo(int x) {
        x &= 0xff;
        x = x & -983041;
        x = x & 0xfff0ffff;
        x |= 0xae00ae;
        x = 0xae0fff0 | x;
        return x;
    }
}

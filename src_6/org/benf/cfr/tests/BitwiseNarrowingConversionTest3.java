package org.benf.cfr.tests;

class BitwiseNarrowingConversionTest3 {
    int byteAnd0() {
        int b = 1;
        int x = 0;
        do {
            b = (byte) ((b ^ x));
        } while (b++ < 10);
        return b;
    }
}

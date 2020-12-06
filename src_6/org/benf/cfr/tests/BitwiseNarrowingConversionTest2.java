package org.benf.cfr.tests;

class BitwiseNarrowingConversionTest2 {
    int byteAnd0() {
        int b = 1;
        b = (byte) ((b & 0) - (b&1));

        return b;
    }

}

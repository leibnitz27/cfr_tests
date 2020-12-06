package org.benf.cfr.tests;

class BitwiseNarrowingConversionTest1 {
    int byteAnd0() {
        int b = 0;
        b = (byte) (b & 0);

        return b;
    }

    boolean boolAnd0() {
        boolean b = false;
        b = (b & false);

        return b;
    }

    boolean boolAnd1() {
        boolean b = false;
        b = (b && false);

        return b;
    }

}

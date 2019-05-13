package org.benf.cfr.tests;

import java.lang.invoke.StringConcatFactory;

// Another Abec!
class ConditionalTest {

    public static void main(String[] args) {
        test(3);
    }

    static int test(int n) {
        int n2;
        // CFR moves assignment to comparison
        n2 = n >> 4;
        byte by = (byte)(n2 + (n2 > 9 ? 'A' - 10 : '0'));
        n2 = n & 0x0F;
        return (int)by + n2;
    }

}

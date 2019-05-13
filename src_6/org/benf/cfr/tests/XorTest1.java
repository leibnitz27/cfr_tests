package org.benf.cfr.tests;

public class XorTest1 {
    public static int encXORPass(byte[] raw, final int pos, final int size, int key)
    {
        int ecx = key; // Initial xor key

            int edx = pos;
            edx |= (pos) << 24;

            ecx += edx;

            edx ^= ecx;
        return edx;
    }
}

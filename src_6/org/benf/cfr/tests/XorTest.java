package org.benf.cfr.tests;

public class XorTest {
    public static void encXORPass(byte[] raw, final int offset, final int size, int key)
    {
        int stop = size - 8;
        int pos = 4 + offset;
        int edx;
        int ecx = key; // Initial xor key

        while (pos < stop)
        {
            edx = raw[pos] & 0xFF;
            edx |= (raw[pos + 1] & 0xFF) << 8;
            edx |= (raw[pos + 2] & 0xFF) << 16;
            edx |= (raw[pos + 3] & 0xFF) << 24;

            ecx += edx;

            edx ^= ecx;

            raw[pos++] = (byte) (edx & 0xFF);
            raw[pos++] = (byte) (edx >> 8 & 0xFF);
            raw[pos++] = (byte) (edx >> 16 & 0xFF);
            raw[pos++] = (byte) (edx >> 24 & 0xFF);
        }

        raw[pos++] = (byte) (ecx & 0xFF);
        raw[pos++] = (byte) (ecx >> 8 & 0xFF);
        raw[pos++] = (byte) (ecx >> 16 & 0xFF);
        raw[pos] = (byte) (ecx >> 24 & 0xFF);
    }
}

package org.benf.cfr.tests;
// Dmitry Kostyukchenko
public class TypeTest47 {
    private static byte divmod256(byte [] num, int start) {
        int remainder = 0;
        for (int i = start;i<num.length;i++) {
            int dig = (int)num[i] & 0xff;
            int temp = remainder * 58 + dig;
            num[i] = (byte)(temp / 256);
            remainder = temp % 256;
        }
        return (byte)remainder;
    }

}

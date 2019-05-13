package org.benf.cfr.tests;

public abstract class IncrTest7b {

    abstract int toDigit(char x, int y);

    public void foo(int len, char data[], byte out[]) {
        for (int i = 0, j = 0; j < len; i++) {
            int f = j << 4;
            j++;
            f = f | toDigit(data[j], j);
            j++;
            out[i] = (byte) (f & 0xFF);
        }
    }
}

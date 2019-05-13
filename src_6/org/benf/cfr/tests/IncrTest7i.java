package org.benf.cfr.tests;

public abstract class IncrTest7i {

    abstract int toDigit(char x, int y);

    public void foo(int len, char data[], byte out[]) {
        for (int i = 0, j = 0; i < len; i++) {
            int f =  j << 4 + toDigit(data[j], i++);
            out[i] = (byte) (f & 0xFF);
        }
    }
}

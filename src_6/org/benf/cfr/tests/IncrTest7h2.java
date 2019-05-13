package org.benf.cfr.tests;

public abstract class IncrTest7h2 {

    abstract int toDigit(char x, int a,int y);

    public void foo(int len, char data[], byte out[]) {
        for (int i = 0, j = 0; i < len; i++) {
            int f = j << 4;
            f = f | toDigit(data[j],i, i++);
            out[i] = (byte) (f & 0xFF);
        }
    }
}

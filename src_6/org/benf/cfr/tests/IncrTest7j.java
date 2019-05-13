package org.benf.cfr.tests;

public abstract class IncrTest7j {

    abstract int toDigit(char x, int y);

    public void foo(int x, int data[]) {
        data[data[x]] = data[x];
    }

    public void foo2(int x, int data[]) {
        data[data[x++]] = data[x];
    }

    public void foo3(int x, int data[]) {
        data[data[++x]] = data[x];
    }

    public void foo4(int x, int data[]) {
        data[data[x]] = data[++x];
    }
}

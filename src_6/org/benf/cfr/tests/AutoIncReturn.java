package org.benf.cfr.tests;

public class AutoIncReturn {
    int x = 0;

    public int getAndInc() {
        return x++;
    }
}

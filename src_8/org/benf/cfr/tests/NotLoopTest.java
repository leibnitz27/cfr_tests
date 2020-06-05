package org.benf.cfr.tests;

public class NotLoopTest {
    public void doIt(Boolean[] b) {
        for (int x=0;x<b.length;++x) {
            b[x] = !b[x];
        }
    }
}

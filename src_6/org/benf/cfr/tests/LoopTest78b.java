package org.benf.cfr.tests;

public class LoopTest78b {
    private int i;

    public int doSomething() {
        while (true) {
            if (i <= 1) {
                doSomething2();
                if (i == 0) {
                    break;
                }
            }
            if (i >= 41) {
                doSomething2();
            }
            if (i == 23) break;
        }
        return 0;
    }

    private void doSomething2() {
    }
}

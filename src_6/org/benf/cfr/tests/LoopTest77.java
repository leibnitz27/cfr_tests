package org.benf.cfr.tests;

public class LoopTest77 {
    private int i;

    public int doSomething() {
        while (true) {
            if (i <= 1) {
                doSomething2();
                if (i == 0) {
                    break;
                }
            }
            if (i % 5 == 3) break;
            if (i >= 41) {
                doSomething2();
                if (i == 42) {
                    return 1;
                }
            }
            if (i == 23) break;
        }
        return 0;
    }

    private void doSomething2() {
    }
}

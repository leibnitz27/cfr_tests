package org.benf.cfr.tests;

public class CondTest12 {
    public int foo(boolean a, boolean b, boolean c) {
        if (a) {
            if (b) {
                doSomething();
            } else {
                if (c) {
                    doSomething();
                    return 1;
                } else {
                    doSomething();
                    return 0;
                }
            }
        } else {
            doSomething();
        }
        doSomething();
        return 2;
    }

    private void doSomething() {
    }
}

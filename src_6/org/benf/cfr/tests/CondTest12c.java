package org.benf.cfr.tests;

public class CondTest12c {
    public int foo(boolean a, boolean b) {
        if (a) {
            if (b) {
                return 1;
            } else {
                doSomething();
            }
        } else {
            doSomething();
        }
        return 2;
    }

    private void doSomething() {
    }
}

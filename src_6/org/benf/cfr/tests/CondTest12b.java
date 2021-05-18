package org.benf.cfr.tests;

public class CondTest12b {
    public int foo(boolean a, boolean b) {
        if (a) {
            if (b) {
                doSomething();
            } else {
                return 1;
            }
        } else {
            doSomething();
        }
        return 2;
    }

    private void doSomething() {
    }
}

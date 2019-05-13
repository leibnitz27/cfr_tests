package org.benf.cfr.tests;

public abstract class LeeZhou1 {
    private static class C1 {
        private final int x;

        private C1(int x) {
            this.x = x;
        }
    }

    public abstract boolean test();

    public void foo() {
        int i;
        if (test()) {
            i = 999;
        } else {
            i = -1;
        }
        Object x = new C1(i);
    }
}

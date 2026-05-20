package org.benf.cfr.tests;

public class SynchronizedMethodTest {

    private int count;
    private static int total;

    public synchronized int increment() {
        return ++count;
    }

    public synchronized int decrementBy(int n) {
        count -= n;
        return count;
    }

    public static synchronized int bumpTotal() {
        return ++total;
    }

    public final synchronized String describe() {
        return "count=" + count;
    }
}

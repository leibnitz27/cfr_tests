package org.benf.cfr.tests;

public class VolatileFieldTest {

    private volatile int counter;
    private volatile long timestamp;
    private volatile boolean ready;
    private volatile Object handle;
    private static volatile String shared;

    public int tick() {
        return ++counter;
    }

    public void publish(Object o) {
        handle = o;
        ready = true;
    }

    public static void share(String s) {
        shared = s;
    }
}

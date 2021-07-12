package org.benf.cfr.tests;

public class SyncTest253 {
    private static final Object lock = new Object();
    private static SyncTest253 e = null;

    // Fails to decompile
    public static SyncTest253 getFail1() {
        if (e == null)
            synchronized (SyncTest253.class) {
                e = new SyncTest253();
            }
        return e;
    }
}
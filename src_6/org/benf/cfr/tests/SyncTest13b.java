package org.benf.cfr.tests;

public class SyncTest13b {
    public void test(int x) {
        while (true) {
            synchronized (this) {
                long time = System.currentTimeMillis();
                if (time > (long)x) {
                    System.out.println("X");
                    return;
                }
            }

        }
    }
}

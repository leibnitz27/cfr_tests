package org.benf.cfr.tests;

public class SyncTest13 {
    public void test(int x) {
        while (true) {
            synchronized (this) {
                long time = System.currentTimeMillis();
                if (time > (long)x) {
                    System.out.println("X");
                    return;
                }
            }

            synchronized (this) {
                try {
                } catch (Exception e) {
                    System.out.print(e.getStackTrace());
                }
            }
        }
    }
}

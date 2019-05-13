package org.benf.cfr.tests;

public class SyncTest13a {
    public void test(int x) {
        while (true) {
            if (x > 3) {
                return;
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

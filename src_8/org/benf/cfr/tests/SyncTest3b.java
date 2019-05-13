package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class SyncTest3b {

    private int x = 1;
    private Object y;

    public void test1() {
        if (true) {
            synchronized (this) {
                if (!false) {
                    try {
                        synchronized (y) {
                            int x = 5;
                            y = x;
                        }
                    } catch (Throwable e) {
                        throw e;
                    }
                }
            }

        }
    }
}

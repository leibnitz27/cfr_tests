package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class SyncTest3c {

    private int x = 1;
    private Object y;

    public void test1() {
        if (true) {
            synchronized (this) {
                    try {
                        synchronized (y) {
                            int x = 5;
                        }
                    } catch (Throwable e) {
                        throw e;
                    }
            }

        }
    }
}

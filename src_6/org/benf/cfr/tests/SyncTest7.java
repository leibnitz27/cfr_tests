package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 */
public class SyncTest7 {

    public int test (final Object a, final Object b, final Object c, final Object d) {
        synchronized (a) {
            synchronized (b) {
                synchronized (c) {
                    synchronized (d) {
                        return 1;
                    }
                }
            }
        }
    }
}

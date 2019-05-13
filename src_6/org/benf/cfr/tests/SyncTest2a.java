package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class SyncTest2a {

    private int x;

    private boolean called;
    private int OnlyCallOnce() {
        if (!called) { called = true; return 10;}
        throw new IllegalStateException();
    }

    public void test1() {
        synchronized (this) {
            try {
                x = x / 0;
            } catch (RuntimeException e) {
                x = 4;
            } finally {
                x = OnlyCallOnce();
            }
        }
    }
}

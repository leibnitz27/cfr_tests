package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 */
public class SyncTest10 {

    public void test (final Object a,int b, int c, int d) {
        synchronized (a) {
            d = b / c;
            System.out.println(d);
        }
    }
}

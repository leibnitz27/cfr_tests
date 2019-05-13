package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest19 {

    private static int[] sizeTable;

    static int stringSize(final int i) {
        int n=0;
        for (;i > sizeTable[n];++n) {
        }
        return n + 1;
    }
}

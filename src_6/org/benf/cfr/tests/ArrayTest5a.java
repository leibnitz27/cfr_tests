package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ArrayTest5a {
    int x;
    int y;
    int z;

    void test3(int a, int b) {
        // 148 decompiles ECJ's
        //         int[][] tmp = new int[][]{{a}};
        // as
        // new int[1][0][0] = new int[]{a}.
        // This looks really bad until you notice where the brackets are!!
        // try to repro with jdk.
        (new int[1][0])[0] = new int[]{a};
    }
}

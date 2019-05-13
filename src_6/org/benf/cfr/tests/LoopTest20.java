package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest20 {

    int y;

    public void test1(int end) {
        for (int y = 0; y < end; ++y) {
            System.out.println(y);
        }
    }

    public void test2(int end) {
        for (y = 0; y < end; ++y) {
            System.out.println(y);
        }
    }
}

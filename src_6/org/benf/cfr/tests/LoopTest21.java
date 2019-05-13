package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest21 {

    Integer y;

    public void test1(Integer end) {
        for (Integer y = 0; y < end; ++y) {
            System.out.println(y);
        }
    }

    public void test2(Integer end) {
        if (Integer.valueOf(y) == null) return;
        for (y = 0; y < end; ++y) {
            System.out.println(y);
        }
    }
}

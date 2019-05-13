package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest40d {

    int[] fn(int []i) {
        return i;
    }

    public void test(int [] xs)
    {
        for (int i : fn(xs)) {
            System.out.println(i);
        }
        fn(xs);
    }
}

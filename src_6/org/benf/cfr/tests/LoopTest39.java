package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest39 {

    public void test(int [] xs)
    {
        for (int x : xs) {
            System.out.println(x);
            for (int y : xs) {
                System.out.println(y);
            }
        }
        for (int x : xs) {
            System.out.println(x);
        }
    }
}

package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 27/05/2011
 * Time: 06:54
 * To change this template use File | Settings | File Templates.
 */
public class CondJumpTest2b {


    public boolean test(boolean  a, boolean  b)
    {
        if (a) {
            System.out.println("t1");
            if (b) {
                return true;
            }
            System.out.println("t2");
        }
        return false;
    }
}

package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class CondJumpTest3c {

    public boolean test(boolean  a, boolean  b)
    {
        boolean  c = false;
        if (((b && a == (c = b) && b) || !c)) {
            System.out.println(Boolean.valueOf(c));
        }
        return c;
    }
}

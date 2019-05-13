package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest36 {

    public boolean test(boolean  a, boolean  b)
    {
        boolean res = true;
        boolean c = true;
        do {
            c = false;
            System.out.println(Boolean.valueOf(res));
        } while (res = (b && a == (c = b) && b && c));
        return c;
    }
}

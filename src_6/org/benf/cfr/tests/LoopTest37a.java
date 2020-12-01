package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest37a {

    public boolean test(boolean  a, boolean  b)
    {
        int x = 0;
        while (x<10) {
            System.out.println(x);
            ++x;
        }
        return a;
    }
}

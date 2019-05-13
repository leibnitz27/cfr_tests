package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest38 {

    public boolean test(boolean  a, boolean  b)
    {
        for (int x=10; x --> 0;) {
            System.out.println(x);
        }
        return a;
    }
}

package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class CondTest8 {


    public boolean test (boolean  a, boolean  b, boolean c)
    {
        System.out.println((c ? (b ? a : c) : b));
        return c;
    }


}

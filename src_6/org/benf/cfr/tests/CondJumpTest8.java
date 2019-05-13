package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class CondJumpTest8 {

    public boolean test(int a, int  b)
    {
        int  c;
        return (a++ == (c = (b+a)) && ++a == (c = (b+a)) && c < 0);
    }
}

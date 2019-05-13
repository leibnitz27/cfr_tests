package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class CondJumpTest8a {

    public static boolean test(int a, int  b)
    {
        return (a++ == a);
    }

    public static void main(String ... args) {
        System.out.println(test(3,2));
    }
}

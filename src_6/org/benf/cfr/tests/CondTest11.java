package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class CondTest11 {


    public boolean test (int a, int b)
    {
        if (~a == b) {
            System.out.println("tesT");
            return false;
        }
        return true;
    }

    public boolean test (boolean a, boolean b)
    {
        if ((a^b) == b) {
            System.out.println("tesT");
            return false;
        }
        return true;
    }

    public boolean test2 (int a, int b)
    {
        if (~a == (b^-1)) {
            System.out.println("tesT");
            return false;
        }
        return true;
    }
}

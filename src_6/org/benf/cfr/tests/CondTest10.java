package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class CondTest10 {


    public boolean test (boolean  a, boolean  b, boolean c)
    {
        if (!(a ^ b)) {
            System.out.println("tesT");
            return false;
        }
        return true;
    }


}

package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 15/04/2011
 * Time: 18:05
 */
public class UsageTest4 {

    public void test1(boolean a) {
        char b = 0;
        if (a) {
            System.out.println("A!");
        } else {
            b = 'b';
        }
        if (a ||!a) { // woo but the tautology still gets compiled in.
            System.out.println("B is " + b);
        }
    }

}

package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 15/04/2011
 * Time: 18:05
 */
public class UsageTest2 {

    public void test1(boolean a) {
        char b;
        if (a) {
            System.out.println("A!");
            b = 'a';
        } else {
            b = 'b';
        }
        System.out.println("B is " + b);
    }

}

package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest14 {


    public int foo(int i) {

        int a = 1;
        a = 2+a;
        if (i == 1) {
            a = 8;
        } else {
            a = 9;
        }
        return a;
    }
}

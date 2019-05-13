package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest19 {

    public void foo(Object o, String s, Integer i, Number n, Double d, int x) {
        Number n2 = null;
        if (x==2) n2 = d;
        if (x==3) n2 = i;
        System.out.println(n2);
    }
}

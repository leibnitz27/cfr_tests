package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest3 {

    public void foo(int i) {
        {
            int a = 3;
            System.out.println(a);
        }
        String b = "5";
        {
            String a = "Hello";
            System.out.println(a+b);
        }
    }
}

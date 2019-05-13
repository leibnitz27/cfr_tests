package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest5 {

    public void foo(int i) {
        {
            Integer a = 3;
            System.out.println(a);
        }
        {
            String a = "Hello";
            System.out.println(a);
        }
    }
}

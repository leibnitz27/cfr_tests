package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest22 {

    public float fred;
    public int free;

    public NameTest22(int a) {
        fred = a+3;
        free = a+4;
    }

    public void test1a() {
        System.out.println(fred);
    }

    public void test1b() {
        System.out.println(free);
    }
}

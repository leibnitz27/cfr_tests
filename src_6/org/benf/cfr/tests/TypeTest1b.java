package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class TypeTest1b {


    public void test1(int a) {
        String s = new StringBuilder().append("").append(a).append((char)a).append((float)a).append((double)a).append(a).append((long)a).append(a == 1).toString();
        System.out.println(s);
    }

    public void test2(int a) {
        String s = new StringBuilder().append(a).append((char)a).append((float)a).append((double)a).append(a).append((long)a).append(a == 1).toString();
        System.out.println(s);
    }

    public void test3(int a) {

        String s = "" + a + (char)a + (float)a + (double)a + a + (long)a + (a==1);
        System.out.println(s);
    }

    private static <X> X identity (X a) {
        return a;
    }


    public void test4(int a) {

        String s = "" + Integer.valueOf(a) + (char)a + identity(a) + identity((double)a) + a + (long)a + (a==1);
        System.out.println(s);
    }
}

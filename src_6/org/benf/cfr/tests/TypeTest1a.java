package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class TypeTest1a {


    public void test1() {
        int x = 3;
        char y = '3';
        short z = 3;  // unless you use localtype table, you'll get int.
        boolean a = true;
        String res = "Res : " + a + x + y+ z;
        System.out.println(res);
    }

    public static void main(String ... args) {
        new TypeTest1a().test1();
    }
}

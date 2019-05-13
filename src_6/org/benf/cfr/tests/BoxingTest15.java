package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest15 {
    private void test(Object o) {
//        System.out.println("Object");
    }

    private void test(Integer i) {
//        System.out.println("Integer");
    }

    private void test(int i) {
//        System.out.println("int");
    }


    private void t(int x) {
        test(Integer.valueOf(x));
        test((Object)Integer.valueOf(x));
        test(x);
    }

}

package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest16c {
    private void test(Object o) {
//        System.out.println("Object");
    }

    private void test(Exception e) {
//        System.out.println("Integer");
    }

    private void test(int i) {
//        System.out.println("int");
    }


    private void t(int x) {
        test(null);
    }

}

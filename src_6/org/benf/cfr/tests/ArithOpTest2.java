package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class ArithOpTest2 {
    public void test1(int a, Integer b, int c) {
        System.out.println(a + b * c);
        System.out.println(a * (b + c));
        System.out.println(a * (b * c));
    }


    public void test2(Integer a, int b, Integer c) {
        System.out.println((a + b) * (c + a) * (b + c + a));
    }


    public void test3(int a, Integer b, int c) {
        System.out.println((a / b * c) + (c * a) * (b * c + a));
    }

    public void test4(Integer a, int b, int c) {
        System.out.println(a / (b + c));
        System.out.println(a / b + c);
        System.out.println((a / b) + c);
    }
}

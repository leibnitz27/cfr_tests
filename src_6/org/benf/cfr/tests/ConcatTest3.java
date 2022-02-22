package org.benf.cfr.tests;

public class ConcatTest3 {
    public void test1(String a, String b) {
        String res = a+"(\u0002"+b+")\u0001";
        System.out.println(res);
    }
}

package org.benf.cfr.tests;

public class TernaryTest2 {
    public static void main(String [] args) {
        Object x = args.length < 3 ? new Object() : new TernaryTest2();
        System.out.println(x);
    }
}

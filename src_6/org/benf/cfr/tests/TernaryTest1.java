package org.benf.cfr.tests;

public class TernaryTest1 {
    public static void main(String [] args) {
        Object x = args.length < 3 ? new TernaryTest1() : new Object();
        System.out.println(x);
    }

}

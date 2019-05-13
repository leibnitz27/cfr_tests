package org.benf.cfr.tests;

public class OrderTest5 {
    public void printStuff(int x) {
        System.out.println((x <<= 1) & (x >>= 1) & x);
    }
}

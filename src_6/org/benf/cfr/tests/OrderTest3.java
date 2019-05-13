package org.benf.cfr.tests;

public class OrderTest3 {
    public String f(int x) {
        return Integer.toString(x);
    }

    public void printStuff(int x) {
        ++x;
        System.out.println(f(x) + f(x));
    }
}

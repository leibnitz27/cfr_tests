package org.benf.cfr.tests;

public class OrderTest4 {
    public String f(int x, int y) {
        return Integer.toString(x);
    }

    public void printStuff(int x) {
        ++x;
        System.out.println(f(x,x));
    }
}

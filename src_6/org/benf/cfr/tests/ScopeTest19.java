package org.benf.cfr.tests;

public class ScopeTest19 {

    public static int foo(boolean b) {
        int x;
        if (b) {
            System.out.println("A");
            x = 3;
        } else {
            System.out.println("B");
            x = 3;
        }
        System.out.println(x);
        return x;
    }

}

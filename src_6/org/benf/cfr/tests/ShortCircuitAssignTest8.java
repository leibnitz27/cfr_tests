package org.benf.cfr.tests;

public class ShortCircuitAssignTest8 {
    public boolean test(int a, int b, int c) {
        c = a+b;
        if (a < b && c > 22) {
            System.out.println("TEST");
        }
        System.out.println(c + 12);
        return false;
    }
}

package org.benf.cfr.tests;

public class ShortCircuitAssignTest4c {
    public boolean test1(final boolean a, final boolean b, boolean c) {
        System.out.println((b && a == (c = b) && b));
        return c;
    }
}

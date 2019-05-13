package org.benf.cfr.tests;

public class ShortCircuitAssignTest4a {
    public boolean test1(final boolean a, final boolean b, final boolean[] c) {
        System.out.println((b && a == (c[0] = b) && b));
        return c[0];
    }
}

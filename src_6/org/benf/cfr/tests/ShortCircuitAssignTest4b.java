package org.benf.cfr.tests;

public class ShortCircuitAssignTest4b {
    public boolean test1(final boolean a, final boolean b, boolean[] c, boolean [] d) {
        System.out.println((b && (null != (c = a ? c : d)) && a == (c[0] = b) && b) || !c[0]);
        return c[0];
    }
}

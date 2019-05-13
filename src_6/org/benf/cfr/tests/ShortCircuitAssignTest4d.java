package org.benf.cfr.tests;

public class ShortCircuitAssignTest4d {
    public boolean test1(boolean a, final boolean b, boolean[] c, boolean [] d) {
        System.out.println((b && (null != (c = a ? c : d)) && a == (c[a ? 1 : b?2:3] = b) && b) || !(a = c[0]));
        return a;
    }
}

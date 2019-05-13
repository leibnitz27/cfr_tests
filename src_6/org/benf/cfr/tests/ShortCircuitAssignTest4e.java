package org.benf.cfr.tests;

/*
 * Let's be honest, this is hideous.  If you've written code like this, you deserve it not to work.
 * But it does ;)
 */
public class ShortCircuitAssignTest4e {
    public boolean test1(boolean a, final boolean b, boolean[] c, boolean [] d) {
        System.out.println((b && (null != (c = a ? c : d)) && a == ((c[(a && b || (d[0]= c[(a||c[2])?0:1]))? 1 : b?2:3] = b)) && b) || !(a = c[0]));
        return a;
    }
}

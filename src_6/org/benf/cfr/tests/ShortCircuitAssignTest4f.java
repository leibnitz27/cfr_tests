package org.benf.cfr.tests;

/*
 * Let's be honest, this is hideous.  If you've written code like this, you deserve it not to work.
 * But it does ;)
 */
public class ShortCircuitAssignTest4f {
    public boolean test1(boolean a, final boolean b, boolean c, boolean  d) {
        System.out.println((c = a ? c : d) && ((c = a) ? c : d) );
        return a;
    }
}

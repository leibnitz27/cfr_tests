package org.benf.cfr.tests;

public class ShortCircuitAssignTest4 {
    public boolean test1(final boolean a, final boolean b, final boolean[] c) {
        System.out.println((b && a == (c[0] = b) && b) || !c[0]);
        return c[0];
    }

    public boolean test2(final boolean a, final boolean b, final boolean[] c) {
        System.out.println((b && a == (c[0] = b)) || !c[0]);
        return c[0];
    }

    public boolean test3(final boolean a, final boolean b, final boolean[] c) {
        System.out.println((b && a) || (c[0] = b) || !c[0]);
        return c[0];
    }

    public boolean test4(final boolean a, final boolean b, final boolean[] c) {
        System.out.println((b && (c[0] = a)) || !c[0]);
        return c[0];
    }

    public boolean test5(final boolean a, final boolean b, final boolean[] c) {
        System.out.println(b || (c[0] = a) || !c[0]);
        return c[0];
    }

    public boolean test6(final boolean a, final boolean b, final boolean[] c) {
        System.out.println(b && (c[0] = a));
        return c[0];
    }

    public boolean test7(final boolean a, final boolean b, final boolean[] c) {
        System.out.println(b || (c[0] = a));
        return c[0];
    }

    public boolean test8(final boolean a, final boolean b, final boolean[] c) {
        System.out.println(b && a == (c[0] = b) && b && c[0]);
        return c[0];
    }
}

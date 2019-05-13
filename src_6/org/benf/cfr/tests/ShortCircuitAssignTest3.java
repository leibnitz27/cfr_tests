package org.benf.cfr.tests;

public class ShortCircuitAssignTest3 {
    static boolean c;

    public boolean test1(final boolean a, final boolean b) {
        System.out.println((b && a == (c = b) && b) || !c);
        return c;
    }

    public boolean test2(final boolean a, final boolean b) {
        System.out.println((b && a == (c = b)) || !c);
        return c;
    }

    public boolean test3(final boolean a, final boolean b) {
        System.out.println((b && a) || (c = b) || !c);
        return c;
    }

    public boolean test4(final boolean a, final boolean b) {
        System.out.println((b && (c = a)) || !c);
        return c;
    }

    public boolean test5(final boolean a, final boolean b) {
        System.out.println(b || (c = a) || !c);
        return c;
    }

    public boolean test6(final boolean a, final boolean b) {
        System.out.println(b && (c = a));
        return c;
    }

    public boolean test7(final boolean a, final boolean b) {
        System.out.println(b || (c = a));
        return c;
    }

    public boolean test8(final boolean a, final boolean b) {
        System.out.println(b && a == (c = b) && b && c);
        return c;
    }
}

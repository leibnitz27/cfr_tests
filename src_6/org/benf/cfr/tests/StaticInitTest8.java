package org.benf.cfr.tests;

public class StaticInitTest8 {
    private static int x;

    private static void A() {
    }

    private static void B() {
    }

    static {
        if (System.getenv("foo").equals("bar")) {
            A();
        } else {
            B();
        }
    }
}

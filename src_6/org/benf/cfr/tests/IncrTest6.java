package org.benf.cfr.tests;

public class IncrTest6 {

    public static void bar(int a, int b, boolean c) {
        foo(a++, c ? ++a : a--, c ? --b : ++a);
    }

    public static void foo(int ... x) {

    }
}

package org.benf.cfr.tests;

public class IncrTest6a {

    public static void bar(int a, int b, boolean c) {
        foo(a++, c ? ++a : a--, ++a);
    }

    public static void foo(int a, int b, int c) {

    }
}

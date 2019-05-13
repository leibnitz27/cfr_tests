package org.benf.cfr.tests;


/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 22/08/2012
 * Time: 20:58
 */
enum EnumTest6 {
    FOO{ public void f() { System.out.println(x);} },
    BAR{},
    BAP,
    BOP{ public String toString() { return "OVERRIDE"; }};
    private static String x = "BAR";

    public void f() {
        System.out.println("DEFAULTF");
    }
}

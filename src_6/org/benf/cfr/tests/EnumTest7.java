package org.benf.cfr.tests;


/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 22/08/2012
 * Time: 20:58
 */
enum EnumTest7 {
    FOO{ public void f() { System.out.println(x);} },
    BAR{},
    BAP,
    BOP{ public String toString() { return "OVERRIDE" + FOO.name(); }};
    private static String x = "BAR";

    public void f() {
        System.out.println("DEFAULTF");
    }
}

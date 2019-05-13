package org.benf.cfr.tests;


/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 22/08/2012
 * Time: 20:58
 */
enum EnumTest8 {
    FOO("YAY!"){ public void f() { System.out.println(x);} },
    BAR("f"){  },
    BAP("BAP"),
    BOP("F"){ public String toString() { return "OVERRIDE" + FOO.name(); }};
    private static String x = "BAR";

    private final String s;

    private EnumTest8(String s) {
        this.s = s;
    }

    public void f() {
        System.out.println("DEFAULTF");
    }
}

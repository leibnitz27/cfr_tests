package org.benf.cfr.tests;


/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 22/08/2012
 * Time: 20:58
 */
enum EnumTest5 {
    FOO{ public void f() { System.out.println("FOO!");} },
    BAR{},
    BAP,
    BOP{ public String toString() { return "OVERRIDE"; }};

    public void f() {
        System.out.println("DEFAULTF");
    }
}

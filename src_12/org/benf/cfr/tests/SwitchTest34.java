/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest34 {
    // This is NOT ok to "Accidentally" resugar
    public static void foo(int x) {
        System.out.println("" + (switch (x) {
            case 2 -> ++x;
            default -> x;
        } > 2 ? switch (x) {
            case 3 -> ++x;
            default -> x;
        }  : switch (x) {
            case 3 -> x+10;
            default -> x+=10;
        }));
    }

    public static void main(String ... args) {
        foo(1);
    }
}
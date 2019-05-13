/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest33 {
    // This is NOT ok to "Accidentally" resugar
    public static void foo(int x) {
        System.out.println("" + switch (x) {
            case 2 -> ++x;
            default -> x;
        } + switch (x) {
            case 3 -> ++x;
            default -> x;
        });
    }

    public static void main(String ... args) {
        foo(1);
    }
}
/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest40 {

    public static void foo(int x) {
        System.out.println(switch (x) {
            case 1 -> "Waaaa";
            default -> "BOB";
            }
        );
    }
}

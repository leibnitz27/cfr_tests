/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest25 {

    public static void foo(int x) {
        String y = switch (x) {
            case 1 -> "Fred";
            case 2,3 -> "JIM";
            default -> "BOB";
        };
        System.out.println(y);
    }

    public static void main(String ... args) {
        foo(1);
        foo(3);
        foo(4);
    }
}

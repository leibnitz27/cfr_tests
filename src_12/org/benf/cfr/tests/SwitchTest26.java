/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest26 {

    public static void foo(int x) {
        System.out.println(switch (x) {
            case 1 -> throw new IllegalStateException();
            case 2,3 -> "JIM";
            case 4,5,54 -> "FRED";
            default -> throw new IllegalStateException();
        });
    }

    public static void main(String ... args) {
        foo(1);
        foo(3);
        foo(4);
    }
}

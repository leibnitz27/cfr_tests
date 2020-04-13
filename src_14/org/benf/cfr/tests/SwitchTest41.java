/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest41 {
    public static void foo(int x) {
        String string;
        switch (x) {
            case 1: {
                throw new IllegalStateException();
            }
            case 2:
            case 3: {
                System.out.println("JIM");
                string = "JIM";
                return;
            }
            case 4:
            case 5:
            case 54: {
                string = "FRED";
                break;
            }
            default: {
                string = x < 100 ? "ALICE" : "BOB";
            }
        }
        System.out.println(string);
    }

    public static void main(String ... args) {
        SwitchTest41.foo(1);
        SwitchTest41.foo(3);
        SwitchTest41.foo(50);
        SwitchTest41.foo(300);
        SwitchTest41.foo(4);
    }
}

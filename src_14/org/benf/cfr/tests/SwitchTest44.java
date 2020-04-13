/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest44 {
    public static void foo(int x) {
        String string;
        loop: for (int y=0;y<x;++y) {
            switch (y) {
                case 1: {
                    throw new IllegalStateException();
                }
                case 2:
                case 3: {
                    System.out.println("JIM");
                    string = "JIM";
                    break loop;
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
    }

    public static void main(String ... args) {
        SwitchTest44.foo(1);
        SwitchTest44.foo(3);
        SwitchTest44.foo(50);
        SwitchTest44.foo(300);
        SwitchTest44.foo(4);
    }
}

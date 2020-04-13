/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest43 {
    public static void foo(int x) {
        String string;
        for (int y=0;y<x;++y) {
            switch (y) {
                case 1: {
                    throw new IllegalStateException();
                }
                case 2:
                case 3: {
                    System.out.println("JIM");
                    string = "JIM";
                    continue;
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
        SwitchTest43.foo(1);
        SwitchTest43.foo(3);
        SwitchTest43.foo(50);
        SwitchTest43.foo(300);
        SwitchTest43.foo(4);
    }
}

package org.benf.cfr.tests;

public class StringSwitchTest8a {
    public static void foo(int x, String a) {
        l1: while (x > 0) {
            System.out.println("Such loop");
            l2 : while (true) {
                System.out.println("Much pain");
                if (x++ < 5) {
                    switch (a) {
                        case "Aa":
                        case "okay":
                        case "there":
                        case "fellow":
                            continue l1;
                        case "BB":
                        default:
                            continue l2;
                    }
                }
                System.out.println("wow x2!");
            }
        }
    }

}

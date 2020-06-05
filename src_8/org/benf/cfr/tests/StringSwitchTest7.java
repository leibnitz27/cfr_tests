package org.benf.cfr.tests;

public class StringSwitchTest7 {
    public static void foo(int x) {
        while (true) {
            if (x < 5) {
                switch ("test") {
                    case "okay":
                        continue;
                    default:
                        continue;
                }
            }
            System.out.println("wow x2!");
        }
    }

}

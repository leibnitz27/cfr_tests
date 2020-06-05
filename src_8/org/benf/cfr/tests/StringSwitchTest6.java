package org.benf.cfr.tests;

public class StringSwitchTest6 {
    public static void foo() {
        while (true) {
            switch ("test") {
                case "okay":
                    System.out.println("wow!");
                case "test":
                    continue;
            }
            System.out.println("wow x2!");
        }
    }

}

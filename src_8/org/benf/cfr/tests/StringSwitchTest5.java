package org.benf.cfr.tests;

public class StringSwitchTest5 {
    public static void foo(String string) {
        while (true) {
            switch (string) {
                case "apples":
                    System.out.println("apples");
                    break;
                case "pears":
                    System.out.println("pears");
                    break;
            }
        }
    }

}

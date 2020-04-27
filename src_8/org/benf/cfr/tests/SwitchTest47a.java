package org.benf.cfr.tests;

public class SwitchTest47a {
    void test(String x) {
        switch (x) {
            case "FOO":
                System.out.println("here");
                break;
            case "BAR":
                System.out.println("there");
                break;
            default:
                System.out.println("everywhere");
                break;
        }
        switch (x) {
            case "FOO":
                System.out.println("here");
                break;
            case "BAR":
                System.out.println("there");
                break;
            default:
                System.out.println("everywhere");
                break;
        }
    }
}

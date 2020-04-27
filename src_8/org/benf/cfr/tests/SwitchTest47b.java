package org.benf.cfr.tests;

public class SwitchTest47b {
    void test(String x) {
        switch (x) {
            case "FOO":
                System.out.println("here");
                break;
        }
        switch (x) {
            case "BAR":
                System.out.println("there");
                break;
        }
    }
}

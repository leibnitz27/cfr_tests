package org.benf.cfr.tests;

public class SwitchTest20 {
    void test() {
        switch ((String) null) {
            case "A":
                System.out.println("Can't happen 1");
                break;
            default:
                System.out.println("Can't happen 2");
                break;
        }
        System.out.println("Here");
    }
}

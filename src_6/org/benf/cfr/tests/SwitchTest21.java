package org.benf.cfr.tests;

public class SwitchTest21 {
    void test() {
        switch ((EnumTest1) null) {
            case FOO:
                System.out.println("Can't happen 1");
                break;
            default:
                System.out.println("Can't happen 2");
                break;
        }
        System.out.println("Here");
    }
}

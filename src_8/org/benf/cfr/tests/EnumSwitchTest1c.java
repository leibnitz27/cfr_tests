package org.benf.cfr.tests;

public class EnumSwitchTest1c {

    public String test0(EnumTest1 e) {
        switch (e) {
            case FOO:
                return "foo";
            case BAR:
                return "bar";
            default:
                return "other";
        }
    }
}

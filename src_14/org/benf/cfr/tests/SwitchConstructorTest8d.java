package org.benf.cfr.tests;

class SwitchConstructorTest8d {
    SwitchConstructorTest8d(int i) { }

    SwitchConstructorTest8d(String s) {
        this(switch (s + "FRED") {
            default -> 2;
        });
    }
}

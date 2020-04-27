package org.benf.cfr.tests;

class SwitchConstructorTest8c {
    SwitchConstructorTest8c(int i) { }

    SwitchConstructorTest8c(String s) {
        this(switch (s) {
            default -> 2;
        });
    }
}

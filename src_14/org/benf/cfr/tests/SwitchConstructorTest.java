package org.benf.cfr.tests;

class SwitchConstructorTest {
    SwitchConstructorTest(int i) { }

    SwitchConstructorTest(Byte b) {
        this(switch(b) {
            default -> 1;
        });
    }
}

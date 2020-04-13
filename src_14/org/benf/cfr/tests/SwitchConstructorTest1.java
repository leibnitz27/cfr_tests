package org.benf.cfr.tests;

class SwitchConstructorTest1 {
    SwitchConstructorTest1(int i) { }

    SwitchConstructorTest1(Byte b) {
        this(switch(b) {
            default -> {
                if (b > 3) yield 3;
                yield 2;
            }
        });
    }
}

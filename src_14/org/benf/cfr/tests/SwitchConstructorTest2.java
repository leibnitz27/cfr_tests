package org.benf.cfr.tests;

class SwitchConstructorTest2 {
    SwitchConstructorTest2(int i) { }

    SwitchConstructorTest2(Byte b) {
        this(switch(b) {
                    case 1 -> switch(b) {
                        default -> 2;
                    };
                    default -> 1;
        });
    }
}

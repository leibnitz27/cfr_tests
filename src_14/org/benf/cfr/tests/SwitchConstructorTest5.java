package org.benf.cfr.tests;

class SwitchConstructorTest5 {
    SwitchConstructorTest5(int i, int j) { }

    SwitchConstructorTest5(Byte b) {
        this(switch(b) {
            default -> {
                if (b > 3) yield 3;
                yield 2;
            }
        },
        switch(b) {
            case 1 -> 11;
            default -> {
                if (b > 3) yield 3;
                yield 2;
            }
        }
        );
    }
}

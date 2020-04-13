package org.benf.cfr.tests;

class SwitchConstructorTest5b {
    SwitchConstructorTest5b(int i, int j) { }

    SwitchConstructorTest5b(Byte b) {
        this(
        switch(b) {
            case 1 -> 11;
            default -> {
                if (b > 3) yield 3;
                yield 2;
            }
        },
        switch(b) {
            default -> {
                if (b > 3) yield 3;
                yield 2;
            }
        }
        );
    }
}

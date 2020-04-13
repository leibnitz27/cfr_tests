package org.benf.cfr.tests;

class SwitchConstructorTest5c {
    SwitchConstructorTest5c(int i, int j, int k) { }

    SwitchConstructorTest5c(Byte b) {
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
        },
        switch(b) {
            case 1 -> 14;
            default -> {
                if (b > 3) yield 5;
                yield 4;
            }
        });
    }
}

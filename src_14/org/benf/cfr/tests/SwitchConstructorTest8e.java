package org.benf.cfr.tests;

class SwitchConstructorTest8e {
    SwitchConstructorTest8e(int i, int j) { }

    SwitchConstructorTest8e(String s) {
        this(
                switch (0) {
                    case 1-> 44;
                    default -> 12;
        },
                switch (s + "FRED") {
            default -> 2;
        });
    }
}

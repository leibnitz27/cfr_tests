package org.benf.cfr.tests;

enum SwitchEnumConstructorTest {
    A(switch(0) {
        case 0 -> 1;
        default -> 2;
    }),
    B(switch(0) {
        case 0 -> 3;
        default -> 4;
    });

    private SwitchEnumConstructorTest(int a) { }
}
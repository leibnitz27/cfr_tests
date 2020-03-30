package org.benf.cfr.tests;

enum SwitchEnumConstructorTest2 {
    A(switch(0) {
        case 0 -> 1;
        default -> 2;
    }, switch(0) {
        case 0 -> 3;
        default -> 4;
    }),
    B(2, 3);

    private SwitchEnumConstructorTest2(int a, int b) { }
}
package org.benf.cfr.tests;

class SwitchExpressionAssert2c {
    void test(Integer i) {
        assert switch (i + 1) {
            default -> { System.out.println("FOO"); yield false; }
            case 1 -> true;
        } : switch (i + 2) {
            case 1 -> "1";
            default -> "2";
        };
    }
}
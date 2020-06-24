package org.benf.cfr.tests;

class SwitchExpressionAssert2 {
    void test(Integer i) {
        assert switch (i + 1) {
            case 1 -> true;
            default -> false;
        } : switch (i + 2) {
            case 1 -> "1";
            default -> "2";
        };
    }
}
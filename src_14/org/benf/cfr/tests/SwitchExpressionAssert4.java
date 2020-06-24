package org.benf.cfr.tests;

class SwitchExpressionAssert4 {
    void test(Integer i) {
        assert switch (i + 1) {
            case 1 -> true;
            case 4,7,11 -> false;
            default -> true;
        } : switch (i + 2) {
            case 1 -> "1";
            default -> "2";
        };
    }
}
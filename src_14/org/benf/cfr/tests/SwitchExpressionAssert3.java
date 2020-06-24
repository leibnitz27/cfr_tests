package org.benf.cfr.tests;

class SwitchExpressionAssert3 {
    void test(Integer i) {
        assert i+1 < 4 : switch (i + 2) {
            case 1 -> "1";
            default -> "2";
        };
    }
}
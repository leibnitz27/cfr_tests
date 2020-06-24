package org.benf.cfr.tests;

class SwitchExpressionAssert {
    void test(Integer i) {
        assert switch (i + 1) {
            case 1 -> true;
            default -> false;
        };
    }
}
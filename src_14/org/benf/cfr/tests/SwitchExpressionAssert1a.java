package org.benf.cfr.tests;

class SwitchExpressionAssert1a {
    void test(Integer i) {
        assert switch (i + 1) {
            case 1 -> false;
            default -> true;
        };
    }
}
package org.benf.cfr.tests;

class SwitchExpressionAssert1c {
    void test(Integer i) {
        assert switch (i + 1) {
            default -> { System.out.println("Uh oh"); yield false;}
        };
    }
}
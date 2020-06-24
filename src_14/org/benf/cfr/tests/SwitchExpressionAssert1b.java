package org.benf.cfr.tests;

class SwitchExpressionAssert1b {
    void test(Integer i) {
        assert switch (i + 1) {
            case 1 -> { System.out.println("We good"); yield true;}
            default -> { System.out.println("Uh oh"); yield true;}
        };
    }
}
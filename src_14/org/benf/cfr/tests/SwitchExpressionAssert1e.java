package org.benf.cfr.tests;

class SwitchExpressionAssert1e {
    void test(Integer i) {
        assert switch (i + 1) {
            default -> { System.out.println("Uh oh");
            if (i == 3) yield false;
            if (i < 10) yield true;
            yield true;
            }
        };
    }
}
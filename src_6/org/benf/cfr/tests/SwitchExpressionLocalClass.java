package org.benf.cfr.tests;

public class SwitchExpressionLocalClass {
    void test() {
        switch(0) {
            default: {
                class Test {
                    Test(int i) { }
                }

                new Test(1);
            }
        };
        class Test { }
        new Test();
    }
}

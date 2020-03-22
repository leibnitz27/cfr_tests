package org.benf.cfr.tests;

public class SwitchExpressionLocalClass3 {
    void test() {
        switch(0) {
            case 1:
                System.out.println("FOO");
                break;
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

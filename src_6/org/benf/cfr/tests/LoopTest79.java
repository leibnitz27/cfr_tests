package org.benf.cfr.tests;

public class LoopTest79 {
    public void loopTest(int a) {
        switch (a) {
            case 1:
                int val = getValue();;
                for (;;) {
                    if (val == 0) {
                        doSomething();
                        break;
                    }
                    if (val == 1) {
                        continue;
                    }
                    val = getValue();
                    break;
                }

                doSomething();
                break;
            default:
                break;
        }
    }

    private void doSomething() {
    }

    private int getValue() {
        return 0;
    }
}

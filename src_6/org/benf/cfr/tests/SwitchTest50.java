package org.benf.cfr.tests;

public class SwitchTest50 {
    enum MyEnum {
        A,
        B
    }

    void test(MyEnum e) {
        Label: {
            switch (e) {
                case A:
                    e.name();
                    break;
                case B:
                    e.toString();
                    break Label;
            }

            e.hashCode();
        }

        e.ordinal();
    }
}

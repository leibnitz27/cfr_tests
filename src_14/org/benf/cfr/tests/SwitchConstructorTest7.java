package org.benf.cfr.tests;

class SwitchConstructorTest7 {
    SwitchConstructorTest7(int i, int j) { }

    SwitchConstructorTest7(Byte b) {
        this(switch(0) {
            default -> b;
        },switch (0) {
            default -> {
            System.out.println("HERE");
            yield 3;
            }
        }
                );
    }
}

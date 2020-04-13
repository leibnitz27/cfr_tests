package org.benf.cfr.tests;

import java.util.function.Supplier;

class SwitchConstructorTest4 {
    SwitchConstructorTest4(int i, int j) { }

    SwitchConstructorTest4(Byte b, Supplier<Integer> is) {
        this(
        switch(b) {
            case 0 -> {
                System.out.println("Hello world 2");
                yield is.get();
            }
            default -> {
                System.out.println("Hello world");
                yield is.get();
            }
        },
        switch(b) {
            case 0 -> {
                System.out.println("Goodbye world 2");
                yield is.get();
            }
            default -> {
                System.out.println("Goodbye world");
                yield is.get();
            }
        }

        );
    }
}

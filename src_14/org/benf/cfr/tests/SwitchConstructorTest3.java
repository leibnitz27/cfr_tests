package org.benf.cfr.tests;

import java.util.function.Supplier;

class SwitchConstructorTest3 {
    SwitchConstructorTest3(int i, int j) { }

    SwitchConstructorTest3(Byte b, Supplier<Integer> is) {
        this(
        switch(b) {
            default -> {
                System.out.println("Hello world");
                yield is.get();
            }
        },
        switch(b) {
            default -> {
                System.out.println("Goodbye world");
                yield is.get();
            }
        }

        );
    }
}

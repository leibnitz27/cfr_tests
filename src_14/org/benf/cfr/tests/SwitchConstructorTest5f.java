package org.benf.cfr.tests;

class SwitchConstructorTest5f extends SwitchConstructorTest5d {

    SwitchConstructorTest5f(Byte b) {
        super(
        switch(b) {
            default -> {
                System.out.println("Hello");
                yield 12;
            }
        },
        switch(b) {
            case 1 -> 11;
            default -> {
                if (b > 3) yield 3;
                System.out.println("Foo");
                yield 2;
            }
        },
        switch(b) {
            default -> {
                if (b > 3) yield 3;
                System.out.println("Bar");
                yield 2;
            }
        },
        switch(b) {
            case 1 -> 14;
            default -> {
                if (b > 3) yield 5;
                System.out.println("Bap");
                yield 4;
            }
        },
        switch(b) {
            default -> 13;
        },
        switch(b) {
            default -> 14;
        }
);
    }
}

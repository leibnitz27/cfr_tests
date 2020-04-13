package org.benf.cfr.tests;

class SwitchConstructorTest5d {
    public SwitchConstructorTest5d(int a, int b, int c, int d, int e, int f) { }

    SwitchConstructorTest5d(Byte b) {
        this(
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

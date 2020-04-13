package org.benf.cfr.tests;

class SwitchConstructorTest6 {
    SwitchConstructorTest6(int i) { }

    SwitchConstructorTest6(Byte b) {
        this(switch(b) {
            default -> {
                System.out.println("Hello world");
                if (b<3) {
                    System.out.println("one");

                } else {
                    System.out.println("two");

                }
                yield 2;
            }
        });
    }
}

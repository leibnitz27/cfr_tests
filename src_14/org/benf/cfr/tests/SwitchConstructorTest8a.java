package org.benf.cfr.tests;

class SwitchConstructorTest8a {
    class Parent {
        Parent(int i) { }
    }

    class Sub extends Parent {
        Sub(Byte b) {
            super(switch(b) {
                default -> 1;
            });
        }
    }
}

package org.benf.cfr.tests;

class SwitchConstructorTest8b {
    static class Parent {
        Parent(int i) { }
    }

    static class Sub extends Parent {
        Sub(Byte b) {
            super(switch(b) {
                default -> 1;
            });
        }
    }
}

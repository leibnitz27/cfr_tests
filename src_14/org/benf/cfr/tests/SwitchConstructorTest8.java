package org.benf.cfr.tests;

class SwitchConstructorTest8 {
    class Parent {
        Parent(int i) { }
    }

    enum MyEnum {

    }

    class Sub extends Parent {
        Sub(String s) {
            super(switch (s) {
                default -> 2;
            });
        }

        Sub(String s, int ignored) {
            super(switch (s) {
                case "test" -> 1;
                default -> 2;
            });
        }

        Sub(MyEnum e) {
            super(switch (e) {
                default -> 2;
            });
        }

        Sub(Byte b) {
            super(switch(b) {
                default -> 1;
            });
        }
    }

    SwitchConstructorTest8(int i) { }

    SwitchConstructorTest8(String s) {
        this(switch (s) {
            default -> 2;
        });
    }

    SwitchConstructorTest8(String s, int ignored) {
        this(switch (s) {
            case "test" -> 1;
            default -> 2;
        });
    }

    SwitchConstructorTest8(MyEnum e) {
        this(switch (e) {
            default -> 2;
        });
    }

    SwitchConstructorTest8(Byte b) {
        this(switch(b) {
            default -> 1;
        });
    }
}

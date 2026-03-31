
package org.benf.cfr.tests;

class PatternSwitchMarcono1 {
    enum E {
        A
    }

    void m(E e) {
        switch (e) {
            case A -> System.out.println("A");
            case null, default -> throw new IllegalStateException("null / default");
        }
    }

    int m2(E e) {
        return switch (e) {
            case A -> 100;
            case null, default -> 200;
        };
    }

    int m2b(E e) {
        return switch (e) {
            case A -> 100;
            default -> 200;
        };
    }
}
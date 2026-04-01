
package org.benf.cfr.tests;

class PatternSwitchMarcono1c {
    enum E {
        A
    }

    int m2b(E e) {
        return switch (e) {
            case A -> 100;
            default -> 200;
        };
    }
}
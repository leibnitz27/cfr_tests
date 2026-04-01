
package org.benf.cfr.tests;

class PatternSwitchMarcono1b {
    enum E {
        A
    }

    int m2(E e) {
        return switch (e) {
            case A -> 100;
            case null, default -> 200;
        };
    }
}
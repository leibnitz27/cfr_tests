
package org.benf.cfr.tests;

class PatternSwitchMarcono1a {
    enum E {
        A
    }

    void m(E e) {
        switch (e) {
            case A -> System.out.println("A");
            case null, default -> throw new IllegalStateException("null / default");
        }
    }
}
package org.benf.cfr.tests;

public class DoubleNegationTest {
    Boolean f1(boolean b){
        return !!b;
    }

    boolean f2(boolean b) {
        return !!b;
    }

    // Fun - Fernflower bollocks up and returns b ;)
    // Idea also bollocks up and suggests you remove the negation.
    Boolean f3(Boolean b) {
        return !!b;
    }

    boolean f4(Boolean b) {
        return !!b;
    }
}

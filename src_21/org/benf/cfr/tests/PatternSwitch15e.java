package org.benf.cfr.tests;

// Basic record patterns in switch and instanceof
public class PatternSwitch15e {

    record Point(int x, int y) {}

    static String describePoint(Object obj) {
        return switch (obj) {
            case Point(int y, int a) when y < a -> "point3(" + y + "," + a + ")";
            case null, default -> "other";
        };
    }
}

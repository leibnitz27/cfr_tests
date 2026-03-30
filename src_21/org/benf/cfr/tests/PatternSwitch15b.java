package org.benf.cfr.tests;

// Basic record patterns in switch and instanceof
public class PatternSwitch15b {

    record Point(int x, int y) {}

    static String describePoint(Object obj) {
        return switch (obj) {
            case Point(int x, int y) when x > 10 -> "point1(" + x + "," + y + ")";
            case Point(int x, int y) when y > 20 -> "point2(" + x + "," + y + ")";
            case String s -> "string: " + s;
            case null, default -> "other";
        };
    }
}

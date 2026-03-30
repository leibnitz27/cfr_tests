package org.benf.cfr.tests;

// Basic record patterns in switch and instanceof
public class PatternSwitch15d {

    record Point(int x, int y) {}

    static String describePoint(Object obj) {
        return switch (obj) {
            case Point(int x, int y) when x > 10 -> "point1(" + x + "," + y + ")";
            case Point(int y, int a) when a > 20 -> "point2(" + y + "," + a + ")";
            case String s -> "string: " + s;
            case Point(int y, int a) when y < a -> "point3(" + y + "," + a + ")";
            case null, default -> "other";
        };
    }
}

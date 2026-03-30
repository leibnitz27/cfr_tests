package org.benf.cfr.tests;

// Basic record patterns in switch and instanceof
public class PatternSwitch15h {

    record Point(int x, int y) {}

    static String describePoint(Object obj) {
        return switch (obj) {
            case Point(int y, _) -> "point3(" + y + ",?)";
            case null, default -> "other";
        };
    }
}

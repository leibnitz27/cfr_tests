package org.benf.cfr.tests;

// Basic record patterns in switch and instanceof
public class PatternSwitch15g {

    record Point(int x, int y) {}

    static String describePoint(Object obj) {
        switch (obj) {
            case Point p: {
                int y = p.x();
                int a = p.y();
                return "point3(" + y + "," + a + ")";
            }
            case null, default: return "other";
        }
    }
}

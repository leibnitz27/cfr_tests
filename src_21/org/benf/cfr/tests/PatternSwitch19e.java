package org.benf.cfr.tests;

public class PatternSwitch19e {

    static String describe(Object wr) {
        return switch (wr) {
            case PatternSwitch19d.Wrapper(PatternSwitch19d.Circle(double r)) when r < 10 -> "Circle with radius " + r;
            case PatternSwitch19d.Wrapper(PatternSwitch19d.Rectangle(double w, double h)) -> "Rectangle " + w + "x" + h;
            case PatternSwitch19d.Wrapper(PatternSwitch19d.Circle(double r)) -> "Circle with radius " + r;
            default -> "default";
        };
    }
}
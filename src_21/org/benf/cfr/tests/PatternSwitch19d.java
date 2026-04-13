package org.benf.cfr.tests;

public class PatternSwitch19d {

    public sealed interface Shape permits Circle, Rectangle {
    }

    public record Circle(double radius) implements Shape {
    }

    public record Rectangle(double width, double height) implements Shape {
    }

    public record Wrapper(Shape shape) {
    }

    static String describe(Wrapper wr) {
        return switch (wr) {
            case Wrapper(Circle(double r)) -> "Circle with radius " + r;
            case Wrapper(Rectangle(double w, double h)) -> "Rectangle " + w + "x" + h;
        };
    }
}
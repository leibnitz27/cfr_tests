package org.benf.cfr.tests;

// Sealed interface with record patterns — exhaustive switch (no default)
public class PatternSwitch17 {

    sealed interface Shape permits Circle, Rect {}
    record Circle(double radius) implements Shape {}
    record Rect(double w, double h) implements Shape {}

    static double area(Shape s) {
        return switch (s) {
            case Circle(double r) -> Math.PI * r * r;
            case Rect(double w, double h) -> w * h;
        };
    }

    static String describe(Shape s) {
        return switch (s) {
            case Circle c -> "circle r=" + c.radius();
            case Rect(double w, double h) -> "rect " + w + "x" + h;
        };
    }

    public static void main(String[] args) {
        System.out.println(area(new Circle(5)));
        System.out.println(area(new Rect(3, 4)));
        System.out.println(describe(new Circle(5)));
        System.out.println(describe(new Rect(3, 4)));
    }
}

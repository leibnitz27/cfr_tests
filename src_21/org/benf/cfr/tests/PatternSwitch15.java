package org.benf.cfr.tests;

// Basic record patterns in switch and instanceof
public class PatternSwitch15 {

    record Point(int x, int y) {}
    record Label(String name, Point location) {}

    static String describePoint(Object obj) {
        return switch (obj) {
            case Point(int x, int y) -> "point(" + x + "," + y + ")";
            case String s -> "string: " + s;
            case null, default -> "other";
        };
    }

    static String checkOrigin(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            return (x == 0 && y == 0) ? "origin" : "(" + x + "," + y + ")";
        }
        return "not a point";
    }

    static String describeLabel(Object obj) {
        return switch (obj) {
            case Label(String name, Point(int x, int y)) -> name + "@(" + x + "," + y + ")";
            case Point(int x, int y) -> "point(" + x + "," + y + ")";
            case null, default -> "other";
        };
    }

    public static void main(String[] args) {
        System.out.println(describePoint(new Point(1, 2)));
        System.out.println(describePoint("hi"));
        System.out.println(describePoint(42));
        System.out.println(checkOrigin(new Point(0, 0)));
        System.out.println(checkOrigin(new Point(3, 4)));
        System.out.println(checkOrigin("nope"));
        System.out.println(describeLabel(new Label("home", new Point(10, 20))));
        System.out.println(describeLabel(new Point(5, 6)));
    }
}

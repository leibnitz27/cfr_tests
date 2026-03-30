package org.benf.cfr.tests;

// Deeply nested record patterns
public class PatternSwitch16 {

    record Point(int x, int y) {}
    record Line(Point start, Point end) {}
    record Triangle(Point a, Point b, Point c) {}

    static String describeLine(Object obj) {
        return switch (obj) {
            case Line(Point(int x1, int y1), Point(int x2, int y2)) ->
                "line from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")";
            case Point(int x, int y) -> "point(" + x + "," + y + ")";
            case null, default -> "other";
        };
    }

    static boolean isHorizontal(Object obj) {
        return obj instanceof Line(Point(int x1, int y1), Point(int x2, int y2)) && y1 == y2;
    }

    static String describeTriangle(Object obj) {
        return switch (obj) {
            case Triangle(Point(int ax, int ay), Point(int bx, int by), Point(int cx, int cy)) ->
                "tri[(" + ax + "," + ay + "),(" + bx + "," + by + "),(" + cx + "," + cy + ")]";
            case null, default -> "other";
        };
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(6, 0);
        System.out.println(describeLine(new Line(p1, p2)));
        System.out.println(describeLine(p1));
        System.out.println(isHorizontal(new Line(p1, p3)));
        System.out.println(isHorizontal(new Line(p1, p2)));
        System.out.println(describeTriangle(new Triangle(p1, p2, p3)));
    }
}

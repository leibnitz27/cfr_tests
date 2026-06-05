package org.benf.cfr.tests;

public class PatternSwitch24 {
    record Point(int x, int y) {}

    static String classify(Object o) {
        return switch (o) {
            case Point(int x, int y) when x > y -> "x>y:" + x;
            case Point(int x, int y) when x == y -> "diag";
            case Point(int x, int y) -> "other " + (x + y);
            default -> "?";
        };
    }

    public static void main(String[] args) {
        System.out.println(classify(new Point(3, 1)));
        System.out.println(classify(new Point(2, 2)));
        System.out.println(classify(new Point(1, 5)));
        System.out.println(classify("x"));
    }
}

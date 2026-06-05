package org.benf.cfr.tests;

public class PatternSwitch23 {
    record Point(int x, int y) {}
    record Label(String name, Point location) {}

    static String describe(Object obj) {
        return switch (obj) {
            case Label(String name, Point(int x, int y)) -> name + x + y;
            case Point(int x, int y) -> "p" + x + y;
            default -> "other";
        };
    }

    public static void main(String[] args) {
        System.out.println(describe(new Label("home", new Point(10, 20))));
        System.out.println(describe(new Point(5, 6)));
        System.out.println(describe("x"));
    }
}

package org.benf.cfr.tests;

// var in record patterns
public class PatternSwitch20 {

    record Point(int x, int y) {}
    record Named(String name, Point location) {}

    static String describeWithVar(Object obj) {
        return switch (obj) {
            case Point(var x, var y) -> "point(" + x + "," + y + ")";
            case Named(var name, var loc) -> "named: " + name + " at " + loc;
            case null, default -> "other";
        };
    }

    static String nestedVar(Object obj) {
        if (obj instanceof Named(var name, Point(var x, var y))) {
            return name + "@(" + x + "," + y + ")";
        }
        return "nope";
    }

    public static void main(String[] args) {
        System.out.println(describeWithVar(new Point(1, 2)));
        System.out.println(describeWithVar(new Named("home", new Point(10, 20))));
        System.out.println(describeWithVar("hi"));
        System.out.println(nestedVar(new Named("work", new Point(5, 6))));
        System.out.println(nestedVar(new Point(1, 1)));
    }
}

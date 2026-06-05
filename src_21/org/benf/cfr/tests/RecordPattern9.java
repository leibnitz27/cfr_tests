package org.benf.cfr.tests;

public class RecordPattern9 {
    record Point(int x, int y) {}
    record Box(Point p, int tag) {}

    static String f(Object o) {
        if (o instanceof Box(Point(int x, int y), int tag)) {
            return x + "," + y + ":" + tag;
        }
        return "no";
    }

    public static void main(String[] args) {
        System.out.println(f(new Box(new Point(1, 2), 7)));
        System.out.println(f("nope"));
    }
}

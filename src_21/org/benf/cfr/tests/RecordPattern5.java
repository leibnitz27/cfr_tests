package org.benf.cfr.tests;

public class RecordPattern5 {
    record Point(int x, int y) {}

    static String andCondition(Object o, boolean enabled) {
        if (enabled && o instanceof Point(int x, int y)) {
            return "enabled point " + x + "," + y;
        }
        return "no";
    }

    static String trailingAnd(Object o) {
        if (o instanceof Point(int x, int y) && x > 0 && y > 0) {
            return "positive " + x + "," + y;
        }
        return "no";
    }

    static String orFallback(Object o, Object fallback) {
        if (!(o instanceof Point(int x, int y))) {
            if (fallback instanceof Point(int fx, int fy)) {
                return "fallback " + fx + "," + fy;
            }
            return "no";
        }
        return "primary " + x + "," + y;
    }

    public static void main(String[] args) {
        System.out.println(andCondition(new Point(1, 2), true));
        System.out.println(andCondition(new Point(1, 2), false));
        System.out.println(andCondition("hi", true));
        System.out.println(trailingAnd(new Point(3, 4)));
        System.out.println(trailingAnd(new Point(-1, 4)));
        System.out.println(trailingAnd("hi"));
        System.out.println(orFallback(new Point(5, 6), "ignored"));
        System.out.println(orFallback("hi", new Point(7, 8)));
        System.out.println(orFallback("hi", "nope"));
    }
}

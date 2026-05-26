package org.benf.cfr.tests;

public class RecordPattern2 {
    record Box(int n, String s) {}

    static String describe(Object o) {
        if (o instanceof Box(int n, String s)) {
            return "box n=" + n + " s=" + s;
        }
        return "other";
    }

    public static void main(String[] args) {
        System.out.println(describe(new Box(7, "hi")));
        System.out.println(describe(new Box(0, "")));
        System.out.println(describe("not a box"));
        System.out.println(describe(null));
    }
}

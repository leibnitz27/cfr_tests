package org.benf.cfr.tests;

public class RecordPattern3 {
    record Pair(int a, int b) {}

    static String earlyReturn(Object o) {
        if (!(o instanceof Pair(int a, int b))) {
            return "not a pair";
        }
        return "pair " + a + "," + b;
    }

    static int sumOrZero(Object o) {
        if (!(o instanceof Pair(int a, int b))) return 0;
        return a + b;
    }

    static String nestedNegated(Object o) {
        if (!(o instanceof Pair(int a, int b)) || a < 0) {
            return "rejected";
        }
        return "accepted " + a + "+" + b;
    }

    public static void main(String[] args) {
        System.out.println(earlyReturn(new Pair(3, 4)));
        System.out.println(earlyReturn("hi"));
        System.out.println(sumOrZero(new Pair(5, 6)));
        System.out.println(sumOrZero("nope"));
        System.out.println(nestedNegated(new Pair(1, 2)));
        System.out.println(nestedNegated(new Pair(-1, 2)));
        System.out.println(nestedNegated("nope"));
    }
}

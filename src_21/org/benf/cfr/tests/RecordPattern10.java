package org.benf.cfr.tests;

import java.util.function.Supplier;

public class RecordPattern10 {
    record Point(int x, int y) {}
    record Box(Point p, int tag) {}
    record Three(int a, int b, int c) {}

    static int unusedComponent(Object o) {
        if (o instanceof Three(int a, int b, int c)) {
            return a + c + a;
        }
        return -1;
    }

    static Supplier<String> componentsInLambda(Object o) {
        if (o instanceof Box(Point(int x, int y), int tag)) {
            return () -> x + "," + y + ":" + tag;
        }
        return () -> "no";
    }

    public static void main(String[] args) {
        System.out.println(RecordPattern10.unusedComponent(new Three(1, 2, 3)));
        System.out.println(RecordPattern10.componentsInLambda(new Box(new Point(4, 5), 6)).get());
    }
}

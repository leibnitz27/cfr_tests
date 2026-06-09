package org.benf.cfr.tests;

public class GuardDedupGap {

    static int xCalls;

    record Point(int x, int y) {
        public int x() {
            xCalls++;
            return x;
        }
    }

    static int lambdaForm(Object o) {
        xCalls = 0;
        switch (o) {
            case Point(int x, int y) when x == 1 -> { }
            case Point(int x, int y) when x == 2 -> { }
            default -> { }
        }
        return xCalls;
    }

    static int blockForm(Object o) {
        xCalls = 0;
        switch (o) {
            case Point(int x, int y) when x == 1: break;
            case Point(int x, int y) when x == 2: break;
            default: break;
        }
        return xCalls;
    }

    public static void main(String[] args) {
        Object o = new Point(9, 0);
        int lambda = lambdaForm(o);
        int block = blockForm(o);
        System.out.println("lambda form: x() invoked " + lambda + " time(s)");
        System.out.println("block form: x() invoked " + block + " time(s)");
        if (lambda != block) {
            throw new AssertionError("INCONSISTENT: equivalent switches invoked x() "
                    + lambda + " vs " + block + " times");
        }
        System.out.println("consistent");
    }
}

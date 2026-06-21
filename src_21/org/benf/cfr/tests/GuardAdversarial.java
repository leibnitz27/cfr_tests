package org.benf.cfr.tests;

public class GuardAdversarial {

    static int se = 0;

    record Point(int x, int y) {}
    record Box(Point p, int tag) {}

    static boolean noisy(int v) { se++; return v > 0; }

    static int multiGuard(Object o) {
        switch (o) {
            case Point(int x, int y) when x > y -> { return 1; }
            case Point(int x, int y) when x < y -> { return 2; }
            default -> { return 0; }
        }
    }

    static int guardOnY(Object o) {
        switch (o) {
            case Point(int x, int y) when y == 1 -> { return 1; }
            case Point(int x, int y) when y == 2 -> { return 2; }
            default -> { return 0; }
        }
    }

    static int guardBoth(Object o) {
        switch (o) {
            case Point(int x, int y) when x == 1 && y == 9 -> { return 1; }
            case Point(int x, int y) when x == 2 && y == 8 -> { return 2; }
            default -> { return 0; }
        }
    }

    static int bodyUsesY(Object o, int[] acc) {
        switch (o) {
            case Point(int x, int y) when x == 1 -> { acc[0] = y; }
            case Point(int x, int y) when x == 2 -> { acc[0] = y * 2; }
            default -> { acc[0] = -1; }
        }
        return acc[0];
    }

    static int captureGuard(Object o, int k) {
        switch (o) {
            case Point(int x, int y) when x == k -> { return 1; }
            case Point(int x, int y) when x == k + 1 -> { return 2; }
            default -> { return 0; }
        }
    }

    static int sideEffectGuard(Object o) {
        switch (o) {
            case Point(int x, int y) when noisy(x) -> { return 1; }
            case Point(int x, int y) when noisy(x + 1) -> { return 2; }
            default -> { return 0; }
        }
    }

    static int nestedGuard(Object o) {
        switch (o) {
            case Box(Point(int x, int y), int tag) when x == 1 -> { return 1; }
            case Box(Point(int x, int y), int tag) when x == 2 -> { return 2; }
            default -> { return 0; }
        }
    }

    public static void main(String[] args) {
        int[] acc = new int[1];
        System.out.println(multiGuard(new Point(5, 2)) + " " + multiGuard(new Point(2, 5)));
        System.out.println(guardOnY(new Point(0, 1)) + " " + guardOnY(new Point(0, 2)));
        System.out.println(guardBoth(new Point(1, 9)) + " " + guardBoth(new Point(2, 8)));
        System.out.println(bodyUsesY(new Point(1, 7), acc) + " " + bodyUsesY(new Point(2, 7), acc));
        System.out.println(captureGuard(new Point(3, 0), 3));
        se = 0;
        System.out.println(sideEffectGuard(new Point(-1, 0)) + " se=" + se);
        System.out.println(nestedGuard(new Box(new Point(2, 0), 0)));
    }
}

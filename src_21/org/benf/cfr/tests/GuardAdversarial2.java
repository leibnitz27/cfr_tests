package org.benf.cfr.tests;

public class GuardAdversarial2 {

    static int se = 0;

    record Point(int x, int y) {}
    record Tri(int a, int b, int c) {}

    static boolean call(int v) { se += v; return v > 0; }

    static int orGuard(Object o) {
        switch (o) {
            case Point(int x, int y) when x == 0 || y == 0 -> { return 1; }
            case Point(int x, int y) when x == y -> { return 2; }
            default -> { return 0; }
        }
    }

    static int threeArms(Object o) {
        switch (o) {
            case Point(int x, int y) when x > 0 && y > 0 -> { return 1; }
            case Point(int x, int y) when x < 0 && y < 0 -> { return 2; }
            case Point(int x, int y) when x == y -> { return 3; }
            default -> { return 0; }
        }
    }

    static int mixCapture(Object o, int k) {
        switch (o) {
            case Point(int x, int y) when x + y == k -> { return 1; }
            case Point(int x, int y) when x - y == k -> { return 2; }
            default -> { return 0; }
        }
    }

    static int throwArm(Object o) {
        switch (o) {
            case Point(int x, int y) when x == 1 && y == 2 -> { throw new IllegalStateException("hit"); }
            case Point(int x, int y) when x == 3 -> { return 2; }
            default -> { return 0; }
        }
    }

    static int triGuard(Object o) {
        switch (o) {
            case Tri(int a, int b, int c) when b == 0 && c == 0 -> { return 1; }
            case Tri(int a, int b, int c) when a == b && b == c -> { return 2; }
            default -> { return 0; }
        }
    }

    static int sideCompound(Object o) {
        switch (o) {
            case Point(int x, int y) when call(x) && call(y) -> { return 1; }
            case Point(int x, int y) when call(x) || call(y) -> { return 2; }
            default -> { return 0; }
        }
    }

    static int twoTypes(Object o) {
        switch (o) {
            case Point(int x, int y) when x == y -> { return 1; }
            case Tri(int a, int b, int c) when a == 0 -> { return 2; }
            default -> { return 0; }
        }
    }

    public static void main(String[] args) {
        System.out.println(orGuard(new Point(0, 5)) + " " + orGuard(new Point(4, 4)) + " " + orGuard(new Point(1, 2)));
        System.out.println(threeArms(new Point(2, 3)) + " " + threeArms(new Point(-2, -3)) + " " + threeArms(new Point(5, 5)) + " " + threeArms(new Point(2, -3)));
        System.out.println(mixCapture(new Point(3, 4), 7) + " " + mixCapture(new Point(9, 2), 7) + " " + mixCapture(new Point(1, 1), 7));
        try { throwArm(new Point(1, 2)); System.out.println("nothrow"); } catch (IllegalStateException e) { System.out.println("threw:" + e.getMessage()); }
        System.out.println(throwArm(new Point(3, 9)));
        System.out.println(triGuard(new Tri(5, 0, 0)) + " " + triGuard(new Tri(4, 4, 4)) + " " + triGuard(new Tri(1, 2, 3)));
        se = 0; int r = sideCompound(new Point(2, 3)); System.out.println(r + " se=" + se);
        se = 0; r = sideCompound(new Point(-1, 5)); System.out.println(r + " se=" + se);
        System.out.println(twoTypes(new Point(7, 7)) + " " + twoTypes(new Tri(0, 1, 2)) + " " + twoTypes("x"));
    }
}

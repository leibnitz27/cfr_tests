package org.benf.cfr.tests;

public class GuardAdversarial3 {

    record Inner(int v, int w) {}
    record Mid(Inner inner, int m) {}

    static int guardDeep(Object obj) {
        switch (obj) {
            case Mid(Inner(int v, int w), int m) when w == 9 -> { return 1; }
            case Mid(Inner(int v, int w), int m) when w == 8 -> { return 2; }
            default -> { return 0; }
        }
    }

    static int guardShallow(Object obj) {
        switch (obj) {
            case Mid(Inner(int v, int w), int m) when m == 5 -> { return 1; }
            case Mid(Inner(int v, int w), int m) when m == 6 -> { return 2; }
            default -> { return 0; }
        }
    }

    static int guardInnerFirst(Object obj) {
        switch (obj) {
            case Mid(Inner(int v, int w), int m) when v == 1 -> { return 1; }
            case Mid(Inner(int v, int w), int m) when v == 2 -> { return 2; }
            default -> { return 0; }
        }
    }

    public static void main(String[] args) {
        System.out.println(guardDeep(new Mid(new Inner(0, 9), 0)) + " " + guardDeep(new Mid(new Inner(0, 8), 0)) + " " + guardDeep(new Mid(new Inner(0, 0), 0)));
        System.out.println(guardShallow(new Mid(new Inner(0, 0), 5)) + " " + guardShallow(new Mid(new Inner(0, 0), 6)) + " " + guardShallow(new Mid(new Inner(0, 0), 0)));
        System.out.println(guardInnerFirst(new Mid(new Inner(1, 0), 0)) + " " + guardInnerFirst(new Mid(new Inner(2, 0), 0)) + " " + guardInnerFirst(new Mid(new Inner(3, 0), 0)));
    }
}

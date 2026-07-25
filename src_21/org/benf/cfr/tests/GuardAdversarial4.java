package org.benf.cfr.tests;

public class GuardAdversarial4 {

    record Mid(Mid m, int a, int b) {}

    static int guardDeep(Object obj) {
        switch (obj) {
            case Mid(Mid(Mid(_, int f, int g), int a, int b), int x, int y) when a == x && f == b -> { return 1; }
            case Mid(Mid(_, int a, int b), int x, int y) when a == x -> { return 1; }
            case Mid(_, int a, int b) when a == b -> { return 2; }
            default -> { return 0; }
        }
    }

    public static void main(String[] args) {
        Object arm0 = new Mid(new Mid(new Mid(null, 5, 0), 3, 5), 3, 9);
        Object arm1 = new Mid(new Mid(null, 4, 0), 4, 0);
        Object arm2 = new Mid(null, 7, 7);
        Object def = new Mid(null, 1, 2);
        System.out.println(guardDeep(arm0) + " " + guardDeep(arm1) + " " + guardDeep(arm2) + " " + guardDeep(def) + " " + guardDeep("x"));
    }
}

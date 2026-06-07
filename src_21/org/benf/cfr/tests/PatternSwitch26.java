package org.benf.cfr.tests;

public class PatternSwitch26 {
    record Point(int x, int y) {}

    static int reassignedLocal(Object o) {
        switch (o) {
            case Point(int x, int y) when x > y: return x;
            case Point(int x, int y): {
                int z = x;
                int r = z * 10;
                z = y;
                return r + z;
            }
            default: return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(reassignedLocal(new Point(5, 2)));
        System.out.println(reassignedLocal(new Point(9, 1)));
    }
}

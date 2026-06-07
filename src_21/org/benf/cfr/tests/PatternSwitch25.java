package org.benf.cfr.tests;

public class PatternSwitch25 {
    record Point(int x, int y) {}

    static int armBodyContinue(Object o, int[] xs) {
        int total = 0;
        loop: for (int v : xs) {
            switch (o) {
                case Point(int x, int y) when x > y -> total += x;
                case Point(int x, int y) -> {
                    if (v < 0) continue loop;
                    total += y;
                }
                default -> total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(armBodyContinue(new Point(1, 2), new int[]{-1, 3, -5}));
        System.out.println(armBodyContinue(new Point(5, 1), new int[]{1, 2}));
    }
}

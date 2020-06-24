package org.benf.cfr.tests;

public class LoopTest74 {
    public static void main(String[] args) {
        System.out.println("foo1");
        foo1();
        System.out.println("foo2");
        foo2();
    }

    public static void foo1() {
        int n = 15;
        float i = 10;
        while (i < n) {
            System.out.println(i);
            i -= 2;
            i *= 1.5;
        }
    }

    public static void foo2() {
        int n = 15;
        float i = 10;
        while (i < n) {
            System.out.println(i);
            i *= 1.5;
            i -= 2;
        }
    }
}

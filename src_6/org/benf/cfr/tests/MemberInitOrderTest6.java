package org.benf.cfr.tests;

public class MemberInitOrderTest6 {
    // Graham Edgecombe
    private static int printA() {
        System.out.println("A");
        return 0;
    }

    private static int printB() {
        System.out.println("B");
        return 0;
    }

    private int a;
    private int b;

    private MemberInitOrderTest6() {
        b = printB();
        a = printA();
    }

    public static void main(String[] args) {
        new MemberInitOrderTest6();
    }
}

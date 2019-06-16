package org.benf.cfr.tests;

public class MemberInitOrderTest2 {
    private final int y;
    private final int x;

    private static int thing(String s, int y) {
        System.out.println(s);
        return y;
    }

    public MemberInitOrderTest2() {
        this.y = thing("Hello", 1);
        this.x = thing("Bye", 2);
    }
}

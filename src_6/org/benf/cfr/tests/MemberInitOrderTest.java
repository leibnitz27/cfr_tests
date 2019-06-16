package org.benf.cfr.tests;

public class MemberInitOrderTest {
    private final int x;
    private final int y;

    private static int thing(String s, int y) {
        System.out.println(s);
        return y;
    }

    public MemberInitOrderTest() {
        this.y = thing("Hello", 1);
        this.x = thing("Bye", 2);
    }
}

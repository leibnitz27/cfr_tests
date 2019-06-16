package org.benf.cfr.tests;

public class MemberInitOrderTest3 {
    private final int a;
    private final int y;
    private final int x;

    private static int thing(String s, int y) {
        System.out.println(s);
        return y;
    }

    public MemberInitOrderTest3() {
        this.a = 1;
        this.y = thing("Hello", a);
        this.x = thing("Bye", 2);
    }
}

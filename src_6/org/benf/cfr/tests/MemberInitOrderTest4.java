package org.benf.cfr.tests;

public class MemberInitOrderTest4 {
    private final int a = 1;
    private final int y = thing("Hello", a);
    private final int x = thing("Bye", 2);

    private static int thing(String s, int y) {
        System.out.println(s);
        return y;
    }

    public MemberInitOrderTest4() {
    }
}

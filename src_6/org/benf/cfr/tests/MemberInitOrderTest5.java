package org.benf.cfr.tests;

public class MemberInitOrderTest5 {
    private final int a = 1;
    private final int y;
    private final int x = thing("Bye", 2);

    private static int thing(String s, int y) {
        System.out.println(s);
        return y;
    }

    public MemberInitOrderTest5() {
        y = thing("Hello", a);
    }
}

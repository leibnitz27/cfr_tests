package org.benf.cfr.tests;

public class SuperToStringTest {
    private final int x;

    public SuperToStringTest(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        if (x < 3) {
            return "SuperToStringTest{" +
                    "x=" + x +
                    '}';
        }
        else return super.toString();
    }
}

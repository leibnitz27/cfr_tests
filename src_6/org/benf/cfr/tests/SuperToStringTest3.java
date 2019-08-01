package org.benf.cfr.tests;

public class SuperToStringTest3 extends SuperToStringTest2 {

    public SuperToStringTest3(int x) {
        super(x);
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

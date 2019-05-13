package org.benf.cfr.tests;

public class ConstructorTest14 extends ConstructorTest13 {


    private ConstructorTest14(int x) {
        super("" + x);
        String s;
        int i;
        if (x < 12) {
            s = "HELLO";
            i = 3;
        } else {
            System.out.println("here");
            s = null;
            i = 4;
        }
        System.out.println(s + i);
    }
}

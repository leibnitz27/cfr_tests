package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;

public class ConstructorTest13 {

    protected ConstructorTest13(String s) {

    }

    private ConstructorTest13(int x) {
        this("" + x);
        String s;
        if (x < 12) {
            s = "HELLO";
        } else {
            System.out.println("here");
            s = null;
        }
        System.out.println(s);
    }
}

package org.benf.cfr.tests;

public class TernaryTest4 {
    public static Object bob(Integer a, Double b, boolean c) {
        Object x = a > b ? a : b;
        if (c) x = "Hello";
        return x;
    }
}

package org.benf.cfr.tests;

public class TernaryTest5 {
    public static Number bob(Integer a, Double b, boolean c) {
        Number x = c ? a : b;
        return x;
    }
}

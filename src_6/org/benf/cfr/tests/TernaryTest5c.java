package org.benf.cfr.tests;

public class TernaryTest5c {
    // This will trigger an unboxing.
    public static Number bob(Integer a, Double b, boolean c) {
        Number x = c ? a : b;
        return x;
    }
}

package org.benf.cfr.tests;

public class TernaryTest5b {
    // This will remain boxed - as of 6/18 Idea incorrectly believes the Number casts
    // are redundant.
    public static Number bob(Integer a, Double b, boolean c) {
        Number x = c ? (Number)a : (Number)b;
        return x;
    }
}

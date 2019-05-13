package org.benf.cfr.tests;

public class TernaryTest5d {
    // This will remain boxed - as of 6/18 Idea incorrectly believes the Number casts
    // are redundant.
    public static Number bob(Integer a, Double b, boolean c) {
        Double x = c ? a : b;
        return x;
    }
}

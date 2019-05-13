package org.benf.cfr.tests;

public class TernaryTest3 {
    public static Number bob(Integer a, Double b) {
        Object x = a > b ? a : b;
        return (Number)x;
    }
}

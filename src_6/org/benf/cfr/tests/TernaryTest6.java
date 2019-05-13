package org.benf.cfr.tests;

import java.util.List;
import java.util.Set;

public class TernaryTest6 {
    public static Object bob(List<Integer> a, Set<Double> b, boolean c) {
        Object x = c ? a : b;
        return x;
    }
}

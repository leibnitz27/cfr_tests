package org.benf.cfr.tests;

import java.util.List;
import java.util.Set;

public class TernaryTest8 {
    public static Object bob(List<Integer> a, Set<Integer> b, boolean c) {
        Object x = c ? a : b;
        x = c ? x : "fred";
        return x;
    }
}

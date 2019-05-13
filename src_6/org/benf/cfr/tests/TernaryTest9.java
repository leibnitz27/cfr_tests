package org.benf.cfr.tests;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TernaryTest9 {
    public static Object bob(String a, boolean c) {
        Set<String> b = Collections.singleton(a);
        Object x = c ? a : b;
        return x;
    }
}

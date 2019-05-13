package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TypeTest38c {
    public static <X> void test(Map<X, List<X>> temp) {
        for (X x : temp.keySet()) {
        }
        for (List<X> lx : temp.values()) {
        }

    }

}

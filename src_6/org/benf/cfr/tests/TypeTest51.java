package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TypeTest51 {
    public void foo(Map<Integer, List<String>> map, int x) {
        List<String> l = map.get(x);
        if (l == null) {
            l = new ArrayList<String>();
        }
        l.add("Oh.");
    }
}

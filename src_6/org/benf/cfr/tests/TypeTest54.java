package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class TypeTest54 {
    public void foo(ConcurrentMap<Integer, List<String>> map, int x) {
        List<String> l = map.get(x);
        if (l == null) {
            l = new ArrayList<String>();
        }
        l.add("Oh.");
    }
}

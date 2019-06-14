package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class TypeTest55 {
    public void foo(HashMap<Integer, List<String>> map, int x) {
        List<String> l = map.get(x);
        if (l == null) {
            l = new ArrayList<String>();
        }
        l.add("Oh.");
    }
}

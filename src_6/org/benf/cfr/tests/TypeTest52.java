package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TypeTest52 {
    Map<Integer, List<String>> map = new ConcurrentHashMap<Integer, List<String>>();

    public void foo(int x) {
        List<String> l = map.get(x);
        if (l == null) {
            l = new ArrayList<String>();
        }
        l.add("Oh.");
    }
}

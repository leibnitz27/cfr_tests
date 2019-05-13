package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Pair;
import org.benf.cfr.tests.support.SetFactory;

import java.util.Map;
import java.util.Set;

public class TypeTest41 {

    public void test(Map<String, Integer> map) {
        Set<String> keys = SetFactory.newSet(map.keySet());
        for (String key : keys) {
            System.out.println(key);
        }
    }
}

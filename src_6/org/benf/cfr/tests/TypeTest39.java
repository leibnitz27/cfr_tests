package org.benf.cfr.tests;

import org.benf.cfr.tests.support.UnaryFunction;

import java.util.*;

public class TypeTest39 {

    private <T> void reset(Collection<? extends T> coll) {
    }

    public void reset(Map<String, Integer> m1, Map<Object, Double> m2) {
        reset(m1.values());
        reset(m2.values());
    }
}

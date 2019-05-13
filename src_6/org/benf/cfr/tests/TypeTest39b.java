package org.benf.cfr.tests;

import java.util.Collection;
import java.util.Map;

public class TypeTest39b {

    public interface Wildcard<X> {
    }


    private <T> void reset(Collection<? extends Wildcard<T>> coll) {
    }

    public void reset(Map<String, Wildcard<Integer>> m1, Map<Object, Wildcard<Double>> m2) {
        reset(m1.values());
        reset(m2.values());
    }
}

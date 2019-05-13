package org.benf.cfr.tests;

import java.util.Collection;
import java.util.Map;

public class TypeTest39c {

    Map<String, Wildcard<Integer>> m1;
    Map<Object, Wildcard<Double>> m2;

    private interface Wildcard<X> {
    }

    private <T> void reset(Collection<? extends Wildcard<T>> coll) {
    }

    public void reset() {
        reset(m1.values());
        reset(m2.values());
    }
}

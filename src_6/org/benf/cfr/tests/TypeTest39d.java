package org.benf.cfr.tests;

import java.util.Collection;
import java.util.Map;

public class TypeTest39d {

    Map<String, Wildcard<Integer>> m1;
    Map<Object, BoundWildcard> m2;

    private interface Wildcard<X> {
    }

    private class BoundWildcard implements Wildcard<Integer> {
    }

    private <T> void reset(Collection<? extends Wildcard<T>> coll) {
    }

    public void reset() {
        reset(m1.values());
        reset(m2.values());
    }
}

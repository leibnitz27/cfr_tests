package org.benf.cfr.tests;

import org.benf.cfr.tests.support.UnaryFunction;

import java.util.Map;

// Pruned from cfr's lazymap
public abstract class LazyMap<A, B> implements Map<A, B> {
    private final Map<A, B> inner;
    // Use this as opposed to j8 so we have context in j6 for tests.
    private final UnaryFunction<A, B> factory;

    public LazyMap(Map<A, B> inner, UnaryFunction<A, B> factory) {
        this.inner = inner;
        this.factory = factory;
    }

    @Override
    public B get(Object o) {
        B res = inner.get(o);
        if (res == null) {
            // CFR currently (135) guesses this as Object.
            // we could stick an explicit cast in everywhere, but that decreases the quality of lambdas.
            //noinspection unchecked
            A x = (A) o;
            res = factory.invoke(x);
            inner.put(x, res);
        }
        return res;
    }
}

package org.benf.cfr.tests;

// Issue #118
public class GenericInnerTest1<T> {
    public class Inner {
        T getOuterT() {
            return null;
        }
    }

    Inner test() { return null; }
}

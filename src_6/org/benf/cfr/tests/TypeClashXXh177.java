package org.benf.cfr.tests;

// Three-way type clash in nested ternary, all Number subtypes with different Comparable params
class TypeClashXXh177 {
    public Object foo(boolean a, boolean b) {
        final Object o = a ? Integer.valueOf(1) : (b ? Double.valueOf(2.0) : Long.valueOf(3L));
        return o;
    }
}

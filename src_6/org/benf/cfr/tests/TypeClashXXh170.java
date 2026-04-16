package org.benf.cfr.tests;

// Byte vs Short - both Number, Comparable, but different Comparable parameterizations
class TypeClashXXh170 {
    public Object foo(boolean flag) {
        Byte b = 1;
        Short s = 2;
        final Object o = flag ? b : s;
        return o;
    }
}

package org.benf.cfr.tests;

// Ternary where one branch is null
class TypeClashXXh178 {
    public Object foo(boolean flag) {
        Integer i = 42;
        final Object o = flag ? i : null;
        return o;
    }
}

package org.benf.cfr.tests;

// Ternary stored in Comparable field - narrows type but with clashing parameterizations
class TypeClashXXh176 {
    Comparable field;

    public void foo(boolean flag) {
        Integer i = 1;
        String s = "x";
        field = flag ? i : s;
    }
}

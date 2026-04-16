package org.benf.cfr.tests;

// Float vs Boolean - Number+Comparable vs Comparable+Serializable
class TypeClashXXh171 {
    public Object foo(boolean flag) {
        Float f = 1.0f;
        Boolean b = false;
        final Object o = flag ? f : b;
        return o;
    }
}

package org.benf.cfr.tests;

// Double vs Long - common supertype is Number (both also Comparable, Serializable)
class TypeClashXXh162 {
    public Object foo(boolean flag) {
        Double d = 3.14;
        Long l = 100L;
        final Object o = flag ? d : l;
        return o;
    }
}

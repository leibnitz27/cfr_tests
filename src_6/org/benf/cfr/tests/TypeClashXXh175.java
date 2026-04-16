package org.benf.cfr.tests;

// int[] vs boolean[] - primitive arrays have no common array supertype, just Object
class TypeClashXXh175 {
    public Object foo(boolean flag) {
        // TODO - currently incorrectly flow inferred type.
        final Object o = flag ? new int[1] : new boolean[1];
        return o;
    }
}

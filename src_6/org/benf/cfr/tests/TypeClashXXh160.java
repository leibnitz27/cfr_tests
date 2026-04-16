package org.benf.cfr.tests;

class TypeClashXXh160 {
    public Object foo() {
        Boolean b1 = false;
        Boolean b2 = true;
        final Object o = ((b1) ? -33.998 : b2);
        return o;
    }
}
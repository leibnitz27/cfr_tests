package org.benf.cfr.tests;

// Primitive literal autobox clash: int literal vs boolean literal
class TypeClashXXh173 {
    public Object foo(boolean flag) {
        final Object o = flag ? 99 : true;
        return o;
    }
}

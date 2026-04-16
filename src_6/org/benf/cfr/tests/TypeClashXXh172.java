package org.benf.cfr.tests;

// Ternary in direct return with mismatched boxed types
class TypeClashXXh172 {
    public Object foo(boolean flag) {
        return flag ? Integer.valueOf(1) : Boolean.TRUE;
    }
}

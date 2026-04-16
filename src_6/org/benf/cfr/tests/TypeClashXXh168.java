package org.benf.cfr.tests;

// Ternary result used directly in method call (not assigned to local first)
class TypeClashXXh168 {
    public String foo(boolean flag) {
        Integer i = 42;
        Boolean b = true;
        return String.valueOf(flag ? i : b);
    }
}

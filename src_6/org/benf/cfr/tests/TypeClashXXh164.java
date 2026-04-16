package org.benf.cfr.tests;

// Nested ternary with three different types
class TypeClashXXh164 {
    public Object foo(boolean a, boolean b) {
        Integer i = 1;
        Double d = 2.0;
        String s = "three";
        // Currently get this wrong - the intermediate is clash-fixed, but o's type is already
        // calculated, and not corrected - need to flow the clash fix.
        final Object o = a ? i : (b ? d : s);
        return o;
    }
}

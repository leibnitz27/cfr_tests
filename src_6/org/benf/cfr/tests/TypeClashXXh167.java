package org.benf.cfr.tests;

// Autoboxed double vs Boolean - like the original h160 but with variables swapped
class TypeClashXXh167 {
    public Object foo() {
        Boolean b = true;
        Double d = 1.5;
        final Object o = b ? d : b;
        return o;
    }
}

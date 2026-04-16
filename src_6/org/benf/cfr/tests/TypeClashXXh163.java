package org.benf.cfr.tests;

// Autoboxed int vs String - forces autoboxing then common supertype
class TypeClashXXh163 {
    public Object foo(boolean flag) {
        final Object o = flag ? 42 : "hello";
        return o;
    }
}

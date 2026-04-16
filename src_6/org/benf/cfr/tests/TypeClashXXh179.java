package org.benf.cfr.tests;

// Ternary with String vs StringBuilder - common is CharSequence + Serializable
class TypeClashXXh179 {
    public Object foo(boolean flag) {
        String s = "hello";
        StringBuilder sb = new StringBuilder("world");
        final Object o = flag ? s : sb;
        return o;
    }
}

package org.benf.cfr.tests;

// Integer vs String - common supertype should be Serializable or Comparable or Object
class TypeClashXXh161 {
    public Object foo(boolean flag) {
        Integer i = 42;
        String s = "hello";
        final Object o = flag ? i : s;
        return o;
    }
}

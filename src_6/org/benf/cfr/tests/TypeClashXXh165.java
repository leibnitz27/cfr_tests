package org.benf.cfr.tests;

// Array type clash: Integer[] vs String[] - common is Object[] or Serializable[]
class TypeClashXXh165 {
    public Object foo(boolean flag) {
        final Object[] o = flag ? new Integer[1] : new String[1];
        return o;
    }
}

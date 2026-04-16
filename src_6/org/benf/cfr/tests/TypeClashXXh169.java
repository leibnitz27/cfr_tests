package org.benf.cfr.tests;

// Multiple reassignments with different type ternaries to same Object variable
class TypeClashXXh169 {
    public void foo(boolean a, boolean b) {
        Object o = a ? Integer.valueOf(1) : "hello";
        System.out.println(o);
        o = b ? Double.valueOf(2.0) : Boolean.TRUE;
        System.out.println(o);
    }
}

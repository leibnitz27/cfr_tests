package org.benf.cfr.tests;

// Ternary result passed to overloaded method - type matters for resolution
class TypeClashXXh180 {
    static void bar(Object o) { System.out.println("Object: " + o); }
    static void bar(Comparable c) { System.out.println("Comparable: " + c); }

    public void foo(boolean flag) {
        Integer i = 1;
        String s = "x";
        bar(flag ? i : s);
    }
}

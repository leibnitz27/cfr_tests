package org.benf.cfr.tests;

class InheritedMethodOverloadTest_Nested extends InheritedMethodOverloadTest_Base {
    int i = 1;
    String s = "";

    void inherited(long n) {
        System.out.println("inherited");
    }
    void inheritedObj(Object o) {
        System.out.println("inheritedObj");
    }

    void test() {
        inherited(i);
        inherited((long) i);
        inheritedObj(s);
        inheritedObj((Object) s);
    }
}
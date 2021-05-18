package org.benf.cfr.tests;

public class FieldTest237c {
    int foo(FieldTest237a a) {
       return a.z + 2 < a.x ? a.x : a.y;
    }

    double foo1(FieldTest237a a) {
        return a.z + 2 < a.x ? a.x : a.y;
    }

    String foo2(FieldTest237a a) {
        return a.f;
    }
}

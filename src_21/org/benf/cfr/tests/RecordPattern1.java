package org.benf.cfr.tests;

public class RecordPattern1 {
    void foo(Object o) {
        System.out.println("before");
        if (o instanceof RecordLine21(var a,var b)) {
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println("after");
    }
}

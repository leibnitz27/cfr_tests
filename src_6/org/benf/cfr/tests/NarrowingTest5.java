package org.benf.cfr.tests;

public class NarrowingTest5 {
    
    public void foo() {
        foo(1);
        foo (1L);
    }

    public void foo(int x) {
        System.out.println("foo");
    }

    public void foo(long x) {
        System.out.println("foo2");
    }
}

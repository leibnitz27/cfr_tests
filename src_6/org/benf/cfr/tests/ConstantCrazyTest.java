package org.benf.cfr.tests;

public class ConstantCrazyTest {
    public void foo(int a) {
        if (false) {
            throw new RuntimeException("foo");
        }
        System.out.println("No");
    }
}

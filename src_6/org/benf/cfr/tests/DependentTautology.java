package org.benf.cfr.tests;

public class DependentTautology {
    public void foo(boolean a) {
        if (a && a && a && a) {
            System.out.println("A");
        }
    }
}

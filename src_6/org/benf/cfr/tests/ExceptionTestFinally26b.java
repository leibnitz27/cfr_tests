package org.benf.cfr.tests;

public class ExceptionTestFinally26b {

    public void fn() { }

    public boolean test(final int x) {
        try {
            if (x==0) return true;
            System.out.println("Not here");
        } finally {
            return false;
        }
    }
}

package org.benf.cfr.tests;

public class ExceptionTestFinally26d {

    public void fn() { }

    public boolean test(final int x) {
        try {
            if (x==0) throw new UnsupportedOperationException();
            System.out.println("Not here");
        } finally {
            throw new IllegalStateException();
        }
    }

}

package org.benf.cfr.tests;

public class ExceptionTestFinally26c {

    public void fn() { }

    public boolean test(final int x) {
        try {
            if (x==2) return false;
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException e) {
            System.out.println("foo");
        } finally {
            if (x==1) {
                System.out.print("arg");
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }
}

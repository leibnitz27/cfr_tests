package org.benf.cfr.tests;

public class ExceptionTestFinally26a {

    public void fn() { }

    public boolean test(final int x) {
        try {
            if (x==2) return true;
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException e) {
            System.out.println("foo");
        } finally {
            System.out.print("arg");
            return true;
        }
    }
}

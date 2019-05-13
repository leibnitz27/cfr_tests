package org.benf.cfr.tests;

public class ExceptionTestFinally26g {

    public void fn() { }

    public boolean test(final int x) {
        try {
            if (x==2) return true;
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException e) {
            if (x==11) return false;
            if (x==13) return true;
        }               
        finally {
            System.out.print("brg");
            return false;
        }
    }
}

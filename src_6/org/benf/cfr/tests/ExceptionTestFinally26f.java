package org.benf.cfr.tests;

public class ExceptionTestFinally26f {

    public void fn() { }

    public boolean test(final int x) {
        try {
            if (x==0) { boolean y = true; }
            System.out.println("Not here");
        } finally {
            return false;
        }
    }
}

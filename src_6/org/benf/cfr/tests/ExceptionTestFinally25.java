package org.benf.cfr.tests;

public class ExceptionTestFinally25 {

    public void fn() { }

    public void test(final int x) {
        try {
            System.out.println("A");
            if (x==3) return;
            fn();
        }
        finally {
            try {
                System.out.println("BEE");
                fn();
            } finally {
                System.out.println("C");
            }
        }
    }
}

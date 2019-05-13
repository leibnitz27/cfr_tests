package org.benf.cfr.tests;

public class ExceptionTestFinally24 {

    public void fn() { }

    public void test(final int x) {
        try {
            System.out.println("A");
            fn();
        }
        finally {
            try {
                System.out.println("B");
                fn();
            } finally {
                System.out.println("C");
            }
        }
    }
}

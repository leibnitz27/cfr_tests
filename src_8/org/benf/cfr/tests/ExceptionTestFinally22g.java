package org.benf.cfr.tests;

public class ExceptionTestFinally22g {

    public void test(int x) {
        try {
            try {
                try {
                    return;
                } finally {
                    System.out.println("a");
                }
            }
            finally {
                try {
                    System.out.println("b");
                    if (x==1) throw new IllegalStateException();
                } catch (Throwable t) {
                    System.out.println("c");
                    throw t;
                }
            }
        }
        finally {
            System.out.println("d");
        }
    }
}

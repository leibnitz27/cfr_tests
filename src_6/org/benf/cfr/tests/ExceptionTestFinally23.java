package org.benf.cfr.tests;

public class ExceptionTestFinally23 {

    public void test(final int x) throws Throwable {
        try {
            try {
                System.out.println("A");
                throw new Throwable();
            }
            catch (Throwable t){
                System.out.println("B");
                throw t;
            }
            finally {
                System.out.println("inner finally");
            }
        }
        finally {
            System.out.println("finally");
        }
    }
}

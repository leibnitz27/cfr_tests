package org.benf.cfr.tests;

public class ExceptionTestFinally22j {

    private static String negative() {
        return "negative";
    }

    public String test(final int x) {
        try {
            try {
                System.out.println("a");
                return negative();
            }
            catch (IllegalStateException t) {
                System.out.println("b");
                return "inner error";
            }
        }
        catch (RuntimeException e) {
            System.out.println("c");
            return "error";
        }
    }
}

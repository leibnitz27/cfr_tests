package org.benf.cfr.tests;

public class ExceptionTestFinally22 {

    private static String negative() {
        return "negative";
    }

    public String test(final int x) {
        try {
            if (x == 0) {
                return "zero";
            }
            else {
                try {
                    return negative();
                }
                catch (Throwable t) {
                    return "inner error";
                }
                finally {
                    System.out.println("inner finally");
                }
            }
        }
        catch (RuntimeException e) {
            return "error";
        }
        finally {
            System.out.println("finally");
            throw new RuntimeException("whoop whoop");
        }
    }
}

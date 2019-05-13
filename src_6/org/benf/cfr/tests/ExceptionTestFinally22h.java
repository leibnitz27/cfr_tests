package org.benf.cfr.tests;

public class ExceptionTestFinally22h {

    private static String negative() {
        return "negative";
    }

    public String test(final int x) {
        try {
            try {
                return negative();
            }
            catch (Throwable t) {
                return "inner error";
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

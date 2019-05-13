package org.benf.cfr.tests;

public class ExceptionTestFinally22i {

    private static String negative() {
        return "negative";
    }

    public String test(final int x) {
        try {
            try {
                return negative();
            }
            catch (IllegalStateException t) {
                return negative();
            }
        }
        catch (RuntimeException e) {
            return "error";
        }
        finally {
            throw new RuntimeException("whoop whoop");
        }
    }
}

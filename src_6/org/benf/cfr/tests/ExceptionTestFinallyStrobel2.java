package org.benf.cfr.tests;

public class ExceptionTestFinallyStrobel2 {
    private static String zero() {
        return "zero";
    }

    private static String negative() {
        return "negative";
    }

    private static String positive() {
        return "positive";
    }

    public String test(final int x) {
        try {
            if (x == 0) {
                return "zero";
            }
            else {
                try {
                    if (x < 0) {
                        return negative();
                    }
                    else if (x > 0) {
                        return positive();
                    }
                    else if (x == 0) {
                        return zero();
                    }
                }
                catch (Throwable t) {
                    System.out.println("inner catch");
                    return "inner error";
                }
                finally {
                    System.out.println("inner finally");
                }
                return "unreachable";
            }
        }
        catch (RuntimeException e) {
            System.out.println("catch");
            return "error";
        }
        finally {
            System.out.println("finally");
            throw new RuntimeException("whoop whoop");
        }
    }
}

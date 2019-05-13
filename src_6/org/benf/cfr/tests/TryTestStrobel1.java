package org.benf.cfr.tests;

public class TryTestStrobel1 {
    public String test(final int x) {
        try {
            if (x < 0) {
                return "negative";
            }
            else if (x > 0) {
                return "positive";
            }
            else if (x == 0) {
                return "zero";
            }
            else {
                return "unreachable";
            }
        }
        catch (RuntimeException e) {
            System.out.println("catch");
            return "error";
        }
        finally {
            System.out.println("finally");
        }
    }
}

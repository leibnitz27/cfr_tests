package org.benf.cfr.tests;

public class ExceptionTestFinally22a {

    public String test(final int x) {
        try {
            if (x == 0) {
                return "zero";
            }
            else {
                try {
                    if (x==1) return "one";
                }
                finally {
                    System.out.println("inner finally");
                }
            }
        }
        finally {
            System.out.println("finally");
            throw new RuntimeException("whoop whoop");
        }
    }
}

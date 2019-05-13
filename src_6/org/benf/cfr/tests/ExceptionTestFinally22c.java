package org.benf.cfr.tests;

public class ExceptionTestFinally22c {

    public String test(final int x) {
        try {
            try {
                if (x%2==1) {
                    if (x==1) return "one";
                } else {
                    if (x==0) return "zero";
                }
            }
            finally {
                System.out.println("inner finally");
            }
        }
        finally {
            System.out.println("finally");
        }
        return "Done";
    }
}

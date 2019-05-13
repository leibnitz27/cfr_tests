package org.benf.cfr.tests;

public class ExceptionTestFinally22e {

    public String test(int x) {
        try {
            if (x == 0) {
                x = 1;
            }

            try {
                if (x==2) {
                    x = 3;
                }

                try {
                    return "two";
                } finally {
                    System.out.println("inner finally^2");

                }

            }
            finally {
                System.out.println("inner finally");
            }
        }
        finally {
            return ("outer finally");
        }
    }
}

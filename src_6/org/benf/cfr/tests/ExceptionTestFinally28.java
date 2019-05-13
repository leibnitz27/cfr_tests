package org.benf.cfr.tests;

public class ExceptionTestFinally28 {

    boolean a;

    public Object test(final int x) {
        try {
            return null;
        }
        finally {
            this.a = true;
        }
    }
}

package org.benf.cfr.tests;

public class ExceptionTestFinally27 {

    public void fn() { }

    private boolean a;

    public boolean test(final int x) {
        try {
            if (x==2) return true;
            if (x==3) return true;
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException e) {
            try {
                if (x==11) return false;
                if (x==13) return true;
            } finally {
                this.a = false;
            }
        }
        finally {
            this.a = true;
        }
        return false;
    }
}

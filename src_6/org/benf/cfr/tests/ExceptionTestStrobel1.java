package org.benf.cfr.tests;

@SuppressWarnings("ALL")
public class ExceptionTestStrobel1 {
    private static void rethrow(final Throwable t) throws Throwable {
        throw t;
    }

    static void test(final int a, final int b) {
        try {
            try {
                throw new UnsupportedOperationException();
            }
            catch (RuntimeException e) {
                rethrow(e);
                return;
            }
        }
        catch (UnsupportedOperationException e) {
            System.out.println("unchecked");
            return;
        }
        catch (Throwable e) {
            System.out.println("checked");
            return;
        }
    }
}


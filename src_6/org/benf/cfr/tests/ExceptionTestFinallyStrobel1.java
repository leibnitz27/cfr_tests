package org.benf.cfr.tests;

import java.io.FileNotFoundException;

public class ExceptionTestFinallyStrobel1 {
    private static boolean tryEnter(final Object o) {
        return true;
    }

    private static void exit(final Object o) {
    }

    private static void doSomething() throws FileNotFoundException {
    }

    boolean test() {
        final boolean lockAcquired = tryEnter(this);
        boolean result;

        try {
            doSomething();
            result = true;
        }
        catch (FileNotFoundException t) {
            result = false;
        }
        finally {
            if (lockAcquired) {
                exit(this);
            }
        }
        return result;
    }
}

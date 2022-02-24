package org.benf.cfr.tests;

import java.io.IOException;

public class UsingTest13 {
    final static class NotCloseable {
        public final void doSomething() {}
        public final void close() {}
    }

    public void testNonCloseble() throws IOException {
        NotCloseable c = new NotCloseable();
        Throwable t = null;
        try {
            c.doSomething();
        }
        catch (final Throwable x) {
            t = x;
            throw x;
        }
        finally {
            if (c != null) {
                if (t != null) {
                    try {
                        c.close();
                    }
                    catch (final Throwable t2) {
                        t.addSuppressed(t2);
                    }
                }
                else {
                    c.close();
                }
            }
        }
    }
}

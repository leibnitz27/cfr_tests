package org.benf.cfr.tests;

import java.io.Closeable;
import java.util.function.Supplier;

class EmptyStatementsTest1a3fake {

    void emptyTryWithResources(Supplier<Closeable> cf) throws Exception {
        Closeable c = cf.get();
        Throwable throwable = null;
        if (c != null) {
            if (throwable != null) {
                try {
                    c.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
            } else {
                c.close();
            }
        }
        System.out.println("Hah, but c is really " + c);
        c = cf.get();
        throwable = null;
        if (c != null) {
            if (throwable != null) {
                try {
                    c.close();
                }
                catch (Throwable throwable3) {
                    throwable.addSuppressed(throwable3);
                }
            } else {
                c.close();
            }
        }
        System.out.println("Hah, but c is really " + c);
    }
}

package org.benf.cfr.tests;

import java.io.Closeable;

class EmptyStatementsTest1b {

    // not empty ;)
    void emptyTryWithResourcesAccess(Closeable closeable) throws Exception {
        try (closeable) {
            System.out.println("Here");

        }
    }

    void emptyTryWithResourcesCatch(Closeable closeable) throws Exception {
        try (Closeable c = closeable) {
            System.out.println("Here");

        } catch (Exception e) {}
    }
}

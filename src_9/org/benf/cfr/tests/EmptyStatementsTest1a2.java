package org.benf.cfr.tests;

import java.io.Closeable;

class EmptyStatementsTest1a2 {

    void emptyTryWithResourcesAccess(Closeable closeable) throws Exception {
        try (closeable) {}
    }

    void emptyTryWithResourcesCatch(Closeable closeable) throws Exception {
        try (Closeable c = closeable) {} catch (Exception e) {}
    }
}

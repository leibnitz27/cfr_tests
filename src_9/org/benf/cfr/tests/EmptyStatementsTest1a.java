package org.benf.cfr.tests;

import java.io.Closeable;

class EmptyStatementsTest1a {

    void emptyTryWithResources(Closeable closeable) throws Exception {
        try (Closeable c = closeable) {}
    }

}

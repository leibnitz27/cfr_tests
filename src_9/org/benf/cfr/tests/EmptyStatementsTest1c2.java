package org.benf.cfr.tests;

import java.io.Closeable;
import java.util.function.Supplier;

class EmptyStatementsTest1c2 {

    void emptyTryWithResources(Closeable closeable, Supplier<Closeable> fc2) throws Exception {
        try (Closeable c2 = fc2.get(); Closeable c = closeable) {}
    }

}

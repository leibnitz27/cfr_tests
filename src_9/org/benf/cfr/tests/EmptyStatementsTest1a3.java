package org.benf.cfr.tests;

import java.io.Closeable;
import java.util.function.Supplier;

class EmptyStatementsTest1a3 {

    void emptyTryWithResources(Supplier<Closeable> cf) throws Exception {
        try (Closeable c = cf.get()) {}
        try (Closeable c = cf.get()) {}
    }
}

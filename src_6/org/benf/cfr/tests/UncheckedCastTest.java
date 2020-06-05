package org.benf.cfr.tests;

import java.util.List;

public class UncheckedCastTest<T> {
    void use(T t) { }

    void doSomething(List<T> l) {
        use((T) l); // Unchecked cast
    }
}
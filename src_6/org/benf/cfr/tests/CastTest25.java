package org.benf.cfr.tests;

import java.util.List;

public class CastTest25<T> {
    void use(T t) { }

    void doSomething(List<T> l) {
        use((T) l); // Unchecked cast
    }
}

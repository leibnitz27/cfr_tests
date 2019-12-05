package org.benf.cfr.tests;

import java.util.List;

public class CastTest25a<T> {
    void use(T t) { }

    void use(List<T> l) {
        use((T) l); // Unchecked cast
    }
}

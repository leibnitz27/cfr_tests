package org.benf.cfr.tests;

import java.util.function.IntFunction;

public class ObfTest {
    public IntFunction<Inter[]> func() {
        return Inter[]::new;
    }
    static interface Inter { }
}

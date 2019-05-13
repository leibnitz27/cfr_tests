package org.benf.cfr.tests;

import java.util.function.Supplier;

public class ThrowableTest {
    private Throwable t;

    private ThrowableTest(Throwable t) {
        this.t = t;
    }

    public static ThrowableTest create(Supplier<Integer> s) {
        try {
            int i = s.get();
            return null;
        } catch(Exception e) {
            return new ThrowableTest(e);
        }
    }
}

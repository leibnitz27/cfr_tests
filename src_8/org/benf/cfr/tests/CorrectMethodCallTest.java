package org.benf.cfr.tests;

import java.util.function.Supplier;

public interface CorrectMethodCallTest {
    void call(CharSequence s, Object o);
    void call(String s, Object o);
    void call(String s, Supplier<?>... supplier);

    default void test() {
        call("test", () -> "test");
    }
}
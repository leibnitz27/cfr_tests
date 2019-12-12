package org.benf.cfr.tests;

import java.util.function.Supplier;

public interface CorrectMethodCallTest2 {
    void call(String s, Supplier<?>... supplier);
    void call(String s, Object o);
    void call(CharSequence s, Object o);

    default void test() {
        call("test", () -> "test");
    }
}
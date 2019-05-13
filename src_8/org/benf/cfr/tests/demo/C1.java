package org.benf.cfr.tests.demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

public final class C1 {
    public static <T> void consume(final Consumer<T> c, final IntFunction<T> g) {
    }

    public static <T> void consume(final Function<T, ?> c, final IntFunction<T> g) {
    }

    public void foo(Object a) {
    }

    public void foo(Number a) {
    }

    public void foo(Integer a) {
    }
}

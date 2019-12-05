package org.benf.cfr.tests;

import java.util.function.Consumer;

public interface UnboundTypeTest2<T> {
    T doSomething();

    static <T> UnboundTypeTest2<T> getInstance() {
        return null;
    }

    public static <T extends Consumer<Integer>> void foo(String[] args, T consumer) {
        T o2 = UnboundTypeTest2.<T>getInstance().doSomething();
        consumer.accept(2);
        Object o3 = getInstance();
    }
}
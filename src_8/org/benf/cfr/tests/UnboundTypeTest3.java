package org.benf.cfr.tests;

import java.util.function.Consumer;

public interface UnboundTypeTest3<T> {
    T doSomething();

    static <T> UnboundTypeTest3<T> getInstance() {
        return null;
    }

    public static <T extends Consumer<Integer>> void foo(String[] args) {
        T o2 = UnboundTypeTest3.<T>getInstance().doSomething();
        o2.accept(3);
        Object o3 = getInstance();
    }
}
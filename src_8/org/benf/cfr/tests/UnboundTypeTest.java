package org.benf.cfr.tests;

public interface UnboundTypeTest<T> {
    T doSomething();

    static UnboundTypeTest<?> getWildcardInstance() {
        return null;
    }

    static <T> UnboundTypeTest<T> getInstance() {
        return null;
    }

    public static void main(String[] args) {
        Object o = getWildcardInstance().doSomething();
        Object o2 = getInstance().doSomething();
        Object o3 = getInstance();
    }
}
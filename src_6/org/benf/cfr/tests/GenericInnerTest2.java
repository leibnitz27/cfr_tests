package org.benf.cfr.tests;

// Issue #118
public class GenericInnerTest2<T> {
    class Inner<T> {}

    <T> Inner<T> test() { return null; }
}

package org.benf.cfr.tests;

public class FieldTest252d<T extends Comparable<T>>  {
    public static final String CONSTANT = "test";

    private class Inner {
        private final T t;

        Inner(T t) {
            this.t = t;
        }
    }
}

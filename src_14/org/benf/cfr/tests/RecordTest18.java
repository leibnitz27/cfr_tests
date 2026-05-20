package org.benf.cfr.tests;

public class RecordTest18 {

    public record Nested(int value, String name) {
        public Nested {
            name = name.trim();
        }
    }

    public Nested make(int v, String n) {
        return new Nested(v, n);
    }
}

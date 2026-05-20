package org.benf.cfr.tests;

public record RecordTest14(int x, String name) {
    public RecordTest14 {
        name = name.trim();
        if (name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        x = Math.max(0, x);
    }
}

package org.benf.cfr.tests;

public record RecordTest15(int x, String name) {
    public RecordTest15(int x, String name) {
        this.x = x;
        this.name = name == null ? "" : name;
    }
}

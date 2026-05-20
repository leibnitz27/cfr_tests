package org.benf.cfr.tests;

public record RecordTest17(int a, int b, String s, String t) {
    public RecordTest17 {
        s = s.trim();
    }
}

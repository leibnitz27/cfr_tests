package org.benf.cfr.tests;

import java.util.Objects;

public record RecordTest16<T>(T value, int seq) {
    public RecordTest16 {
        Objects.requireNonNull(value);
        seq = Math.max(0, seq);
    }
}

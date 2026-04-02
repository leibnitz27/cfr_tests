
package org.benf.cfr.tests;

class SwitchPatternRegression3a {
    java.time.Instant m(Object o) {
        return switch(o) {
            case Long l -> java.time.Instant.ofEpochMilli(l);
            case Double d -> java.time.Instant.ofEpochMilli((long)(double)d);
            default -> throw new IllegalArgumentException();
        };
    }
}



package org.benf.cfr.tests;

class SwitchPatternRegression3 {
    java.time.Instant m(Object o) {
        return switch(o) {
            case Long l -> java.time.Instant.ofEpochMilli(l);
            default -> throw new IllegalArgumentException();
        };
    }
}



package org.benf.cfr.tests;

class SwitchPatternRegression3c {
    java.time.Instant m(Long o) {
        return switch(o) {
            case Long l -> java.time.Instant.ofEpochMilli(l);
            case null -> throw new IllegalArgumentException();
        };
    }
}


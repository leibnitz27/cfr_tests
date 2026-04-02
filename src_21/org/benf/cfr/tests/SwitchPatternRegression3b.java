
package org.benf.cfr.tests;

class SwitchPatternRegression3b {
    java.time.Instant m(Object o) {
        return java.time.Instant.ofEpochMilli(switch(o) {
            case Long l -> l;
            case Double d -> (long)(double)d;
            default -> throw new IllegalArgumentException();
        });
    }
}


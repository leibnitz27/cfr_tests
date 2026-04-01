
package org.benf.cfr.tests;

class SwitchPatternRegression1 {
    java.time.Instant m(Object o) {
        return switch(o) {
            case Long l -> {
                var result = java.time.Instant.ofEpochMilli(l.intValue());
                yield result;
            }
            default -> null;
        };
    }}


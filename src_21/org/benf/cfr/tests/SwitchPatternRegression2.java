
package org.benf.cfr.tests;

class SwitchPatternRegression2 {
    java.time.Instant m(Object o) {
        return switch(o) {
            case Long l -> {
                var value = l.intValue();
                yield java.time.Instant.ofEpochMilli(value);
            }
            default -> null;
        };
    }
}


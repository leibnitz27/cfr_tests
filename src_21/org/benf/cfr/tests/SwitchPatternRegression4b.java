
package org.benf.cfr.tests;

// Pattern switch intentionally nested in return argument - multiple value branches.
// Here the bytecode DOES distinguish: ofEpochMilli appears once after the switch,
// not duplicated in each arm.
class SwitchPatternRegression4b {
    java.time.Instant m(Object o) {
        return java.time.Instant.ofEpochMilli(switch(o) {
            case Long l -> l;
            case Double d -> (long)(double)d;
            default -> throw new IllegalArgumentException();
        });
    }
}

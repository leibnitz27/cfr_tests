
package org.benf.cfr.tests;

// Pattern switch intentionally nested in return argument - single value branch.
// Bytecode-indistinguishable from the case where ofEpochMilli was inside the case arm.
class SwitchPatternRegression4a {
    java.time.Instant m(Object o) {
        return java.time.Instant.ofEpochMilli(switch(o) {
            case Long l -> l;
            default -> throw new IllegalArgumentException();
        });
    }
}

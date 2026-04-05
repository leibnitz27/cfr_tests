
package org.benf.cfr.tests;

// Simple value switch intentionally nested in a return argument.
class SwitchPatternRegression4 {
    String m(int x) {
        return String.valueOf(switch(x) {
            case 0 -> 1;
            case 1 -> 2;
            default -> 3;
        });
    }
}

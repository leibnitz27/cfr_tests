package org.benf.cfr.tests;

public class PrimitivePatterns4 {

    // switch with mixed primitive and reference patterns
    // Note that java can't discriminate between boxed and unboxed types, unless there's a guard
    // Integer dominates int.
    static String mixedSwitch(int obj, int n, int n2) {
        return switch (obj) {
            case Integer i when i > n -> "bigger than n2";
            case Integer i when i > n2 -> "bigger than n";
            case Integer i when (n < 100 && n2 > 300) && i > 500 -> "very large int";
            default -> "other";
        };
    }

}

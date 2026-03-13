package org.benf.cfr.tests;

public class PrimitivePatterns3 {

    // switch with mixed primitive and reference patterns
    // Note that java can't discriminate between boxed and unboxed types, unless there's a guard
    // Integer dominates int.
    static String mixedSwitch(Object obj) {
        return switch (obj) {
            case Integer i when i > 50 -> "large int";
            case Integer i when i > 10 -> "small int";
            case String s -> "string: " + s;
            case Integer i when i > 500 -> "very large int";
            case null -> "null";
            default -> "other";
        };
    }

}

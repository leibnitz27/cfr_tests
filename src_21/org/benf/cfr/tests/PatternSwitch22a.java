package org.benf.cfr.tests;

// Standalone case null (separate from default)
public class PatternSwitch22a {

    static String nullSeparate(Object obj) {
        return switch (obj) {
            case null -> "explicitly null";
            case String s -> "string: " + s;
            case Integer i -> "int: " + i;
            default -> "other: " + obj;
        };
    }
}

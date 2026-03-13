package org.benf.cfr.tests;

public class PrimitivePatterns5 {

    // Switch on boolean
    static String boolSwitch(boolean b) {
        return switch (b) {
            case true -> "yes";
            case false -> "no";
        };
    }

    // Switch on char with primitive narrowing
    static String charSwitch(char c) {
        return switch (c) {
            case 'A', 'B', 'C' -> "letter";
            case char ch when ch >= '0' && ch <= '9' -> "digit: " + ch;
            case char ch -> "other: " + ch;
        };
    }

    // Switch on float
    static String floatSwitch(float f) {
        return switch (f) {
            case 0.0f -> "zero";
            case float v when v < 0 -> "negative";
            case float v when Float.isNaN(v) -> "NaN";
            case float v when Float.isInfinite(v) -> "infinite";
            case float v -> "positive: " + v;
        };
    }

    // Switch on long
    static String longSwitch(long l) {
        return switch (l) {
            case 0L -> "zero";
            case long v when v == Long.MAX_VALUE -> "max";
            case long v when v == Long.MIN_VALUE -> "min";
            case long v when v < 0 -> "negative";
            case long v -> "positive";
        };
    }

    // Primitive pattern in switch on Object with double
    static String doubleObjectSwitch(Object obj) {
        return switch (obj) {
            case int i -> "int: " + i;
            case double d when d == 0.0 -> "zero double";
            case double d when Double.isNaN(d) -> "NaN";
            case double d -> "double: " + d;
            case null, default -> "other";
        };
    }

    public static void main(String[] args) {
        System.out.println(boolSwitch(true));
        System.out.println(boolSwitch(false));

        System.out.println(charSwitch('A'));
        System.out.println(charSwitch('5'));
        System.out.println(charSwitch('!'));

        System.out.println(floatSwitch(0.0f));
        System.out.println(floatSwitch(-3.14f));
        System.out.println(floatSwitch(Float.NaN));
        System.out.println(floatSwitch(Float.POSITIVE_INFINITY));
        System.out.println(floatSwitch(2.5f));

        System.out.println(longSwitch(0L));
        System.out.println(longSwitch(Long.MAX_VALUE));
        System.out.println(longSwitch(-42L));

        System.out.println(doubleObjectSwitch(0.0));
        System.out.println(doubleObjectSwitch(Double.NaN));
        System.out.println(doubleObjectSwitch(42));
        System.out.println(doubleObjectSwitch(null));
    }
}

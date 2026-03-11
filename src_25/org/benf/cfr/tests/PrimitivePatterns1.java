package org.benf.cfr.tests;

public class PrimitivePatterns1 {

    // switch over int with primitive patterns
    static String describeInt(int x) {
        return switch (x) {
            case 0 -> "zero";
            case 1, 2, 3 -> "small";
            case int i when i < 0 -> "negative: " + i;
            case int i -> "other: " + i;
        };
    }

    // instanceof with primitive widening
    static String testInstanceOf(Object obj) {
        if (obj instanceof int i) {
            return "int: " + i;
        }
        if (obj instanceof long l) {
            return "long: " + l;
        }
        if (obj instanceof double d) {
            return "double: " + d;
        }
        return "other: " + obj;
    }

    // switch with mixed primitive and reference patterns
    // Note that java can't discriminate between boxed and unboxed types, unless there's a guard
    // Integer dominates int.
    static String mixedSwitch(Object obj) {
        return switch (obj) {
            case Integer i when i < 0 -> "negative int";
            case int i -> "int: " + i;
            case long l -> "long: " + l;
            case double d -> "double: " + d;
            case String s -> "string: " + s;
            case null -> "null";
            default -> "other";
        };
    }

    // primitive narrowing in switch
    static String narrowSwitch(int x) {
        return switch (x) {
            case byte b -> "fits in byte: " + b;
            case int i -> "needs int: " + i;
        };
    }

    public static void main(String[] args) {
        System.out.println(describeInt(0));
        System.out.println(describeInt(2));
        System.out.println(describeInt(-5));
        System.out.println(describeInt(99));

        System.out.println(testInstanceOf(42));
        System.out.println(testInstanceOf(100L));
        System.out.println(testInstanceOf(3.14));
        System.out.println(testInstanceOf("hello"));

        System.out.println(mixedSwitch(42));
        System.out.println(mixedSwitch(-3));
        System.out.println(mixedSwitch(100L));
        System.out.println(mixedSwitch(2.5));
        System.out.println(mixedSwitch("hi"));
        System.out.println(mixedSwitch(null));

        System.out.println(narrowSwitch(42));
        System.out.println(narrowSwitch(200));
    }
}

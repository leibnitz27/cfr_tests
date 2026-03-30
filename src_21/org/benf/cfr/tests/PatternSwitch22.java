package org.benf.cfr.tests;

// Standalone case null (separate from default)
public class PatternSwitch22 {

    static String nullSeparate(Object obj) {
        return switch (obj) {
            case null -> "explicitly null";
            case String s -> "string: " + s;
            case Integer i -> "int: " + i;
            default -> "other: " + obj;
        };
    }

    static String nullWithPattern(Object obj) {
        return switch (obj) {
            case null -> "null!";
            case String s when s.isEmpty() -> "empty string";
            case String s -> "string: " + s;
            case Integer i when i < 0 -> "negative";
            case Integer i -> "int: " + i;
            default -> "other";
        };
    }

    // Statement switch with standalone case null and fall-through into default
    static void nullStatement(Object obj) {
        switch (obj) {
            case null:
                System.out.println("got null");
                break;
            case String s:
                System.out.println("string: " + s);
                break;
            default:
                System.out.println("default: " + obj);
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println(nullSeparate(null));
        System.out.println(nullSeparate("hi"));
        System.out.println(nullSeparate(42));
        System.out.println(nullSeparate(3.14));
        System.out.println(nullWithPattern(null));
        System.out.println(nullWithPattern(""));
        System.out.println(nullWithPattern("hi"));
        System.out.println(nullWithPattern(-5));
        System.out.println(nullWithPattern(10));
        nullStatement(null);
        nullStatement("test");
        nullStatement(99);
    }
}

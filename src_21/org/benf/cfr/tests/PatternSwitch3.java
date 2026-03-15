package org.benf.cfr.tests;

public class PatternSwitch3 {

    // Guard calling a method
    static boolean isSpecial(int x) {
        return x == 42 || x == 99;
    }

    static String guardWithMethodCall(Object obj) {
        return switch (obj) {
            case Integer i when isSpecial(i) -> "special: " + i;
            case Integer i when i > 0 -> "positive: " + i;
            case Integer i -> "other int: " + i;
            case null, default -> "not int";
        };
    }

    // Nested ternary in guard
    static String complexGuard(Object obj, boolean flag) {
        return switch (obj) {
            case Integer i when (flag ? i > 0 : i < 0) -> "conditional: " + i;
            case Integer i -> "other: " + i;
            case null, default -> "not int";
        };
    }

    // Switch with exception in guard
    static String guardWithException(Object obj) {
        return switch (obj) {
            case String s when s.length() > 5 -> "long string";
            case String s -> "short string";
            case Integer i when i / 1 > 0 -> "positive";
            case Integer i -> "non-positive";
            case null, default -> "other";
        };
    }

    public static void main(String[] args) {
        System.out.println(guardWithMethodCall(42));
        System.out.println(guardWithMethodCall(5));
        System.out.println(guardWithMethodCall(-1));
        System.out.println(guardWithMethodCall("hello"));

        System.out.println(complexGuard(5, true));
        System.out.println(complexGuard(5, false));
        System.out.println(complexGuard(-3, true));
        System.out.println(complexGuard(-3, false));

        System.out.println(guardWithException("hello world"));
        System.out.println(guardWithException("hi"));
        System.out.println(guardWithException(42));
        System.out.println(guardWithException(-1));
    }
}

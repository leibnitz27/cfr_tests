package org.benf.cfr.tests;

public class PrimitivePatterns7 {

    // instanceof with primitive in loop
    static int countInts(Object[] arr) {
        int count = 0;
        for (Object obj : arr) {
            if (obj instanceof int i) {
                count += i;
            }
        }
        return count;
    }

    // instanceof with primitive in ternary
    static String ternaryInstanceOf(Object obj) {
        return obj instanceof int i ? "int: " + i : "not int";
    }

    // Chained instanceof with narrowing
    static String chainedInstanceOf(Object obj) {
        if (obj instanceof byte b) {
            return "byte: " + b;
        } else if (obj instanceof short s) {
            return "short: " + s;
        } else if (obj instanceof int i) {
            return "int: " + i;
        } else if (obj instanceof long l) {
            return "long: " + l;
        } else if (obj instanceof float f) {
            return "float: " + f;
        } else if (obj instanceof double d) {
            return "double: " + d;
        }
        return "other";
    }

    // instanceof primitive combined with boolean logic
    static boolean isBetween(Object obj, int low, int high) {
        return obj instanceof int i && i >= low && i <= high;
    }

    // Nested switch with primitives
    static String nestedSwitch(Object outer, Object inner) {
        return switch (outer) {
            case Integer i -> switch (inner) {
                case Integer j -> "both int: " + (i + j);
                case String s -> "int and string: " + i + s;
                case null, default -> "int and other";
            };
            case String s -> "string: " + s;
            case null, default -> "other";
        };
    }

    public static void main(String[] args) {
        Object[] arr = {1, "hello", 2, 3.14, 3};
        System.out.println(countInts(arr));

        System.out.println(ternaryInstanceOf(42));
        System.out.println(ternaryInstanceOf("hello"));

        System.out.println(chainedInstanceOf((byte) 1));
        System.out.println(chainedInstanceOf(1000));
        System.out.println(chainedInstanceOf(100L));
        System.out.println(chainedInstanceOf(3.14));

        System.out.println(isBetween(5, 1, 10));
        System.out.println(isBetween(15, 1, 10));
        System.out.println(isBetween("hello", 1, 10));

        System.out.println(nestedSwitch(1, 2));
        System.out.println(nestedSwitch(1, "hi"));
        System.out.println(nestedSwitch("hello", 1));
    }
}

package org.benf.cfr.tests;

// Record patterns with guards and generic records
public class PatternSwitch18 {

    record Pair<A, B>(A first, B second) {}
    record Box<T>(T value) {}

    static String describePair(Object obj) {
        return switch (obj) {
            case Pair(String s, Integer i) -> "string-int: " + s + "=" + i;
            case Pair(Integer a, Integer b) when a > b -> "descending: " + a + ">" + b;
            case Pair(Integer a, Integer b) -> "pair: " + a + "," + b;
            case null, default -> "other";
        };
    }

    static String unbox(Object obj) {
        return switch (obj) {
            case Box(String s) -> "string: " + s;
            case Box(Integer i) when i < 0 -> "negative: " + i;
            case Box(Integer i) -> "int: " + i;
            case Box(Box(String s)) -> "nested: " + s;
            case null, default -> "other";
        };
    }

    public static void main(String[] args) {
        System.out.println(describePair(new Pair<>("hello", 42)));
        System.out.println(describePair(new Pair<>(10, 3)));
        System.out.println(describePair(new Pair<>(3, 10)));
        System.out.println(describePair("nope"));
        System.out.println(unbox(new Box<>("hi")));
        System.out.println(unbox(new Box<>(-5)));
        System.out.println(unbox(new Box<>(7)));
        System.out.println(unbox(new Box<>(new Box<>("deep"))));
    }
}

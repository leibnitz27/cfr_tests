package org.benf.cfr.tests;

public class RecordPattern4 {
    record Holder<T>(T value) {}
    record Map2<K, V>(K key, V value) {}

    static String describe(Object o) {
        if (o instanceof Holder<?>(String s)) {
            return "string holder: " + s;
        }
        if (o instanceof Holder<?>(Integer i)) {
            return "integer holder: " + i;
        }
        if (o instanceof Map2<?, ?>(String k, Integer v)) {
            return "map " + k + "=" + v;
        }
        return "other";
    }

    static String typed(Holder<String> h) {
        if (h instanceof Holder<String>(String s)) {
            return "typed: " + s;
        }
        return "null";
    }

    public static void main(String[] args) {
        System.out.println(describe(new Holder<>("hi")));
        System.out.println(describe(new Holder<>(42)));
        System.out.println(describe(new Map2<>("k", 7)));
        System.out.println(describe(new Map2<>(1, "v")));
        System.out.println(typed(new Holder<>("typed")));
    }
}

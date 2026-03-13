package org.benf.cfr.tests;

public class PrimitivePatterns2 {

    static class Foo {

    }

    static class Bar {

    }

    static class Bap {

    }

    static String describeObj(Object x) {
        return switch (x) {
            case String x2 -> "string";
            case Foo x2 -> "Foo";
            case Bar _, Bap _ -> "Bar/Bap";
            case null, default -> "other: ";
        };
    }


    public static void main(String[] args) {
        System.out.println(describeObj(new Foo()));
        System.out.println(describeObj(new Bap()));
        System.out.println(describeObj(new Bar()));
        System.out.println(describeObj(2));
        System.out.println(describeObj(null));
        System.out.println(describeObj(99.0));
    }
}

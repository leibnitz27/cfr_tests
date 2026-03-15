package org.benf.cfr.tests;

public class PrimitivePatterns9b {

    enum Color { RED, GREEN, BLUE }

    // Enum in a pattern switch on Object
    static String enumObjectSwitch(Object obj) {
        return switch (obj) {
            case Color.RED -> "red";
            case Color.GREEN -> "green";
            case Color c -> "other color: " + c;
            case String s -> "string: " + s;
            case null, default -> "other";
        };
    }

    public static void main(String[] args) {
        System.out.println(enumObjectSwitch(Color.RED));
        System.out.println(enumObjectSwitch(Color.GREEN));
        System.out.println(enumObjectSwitch(Color.BLUE));
        System.out.println(enumObjectSwitch("hello"));
        System.out.println(enumObjectSwitch(null));
    }
}

package org.benf.cfr.tests;

public class PrimitivePatterns9c {

    enum Color { RED, GREEN, BLUE }

    // Enum in a pattern switch on Object
    static String enumObjectSwitch(Color obj) {
        return switch (obj) {
            case Color.RED -> "red";
            case Color.GREEN -> "green";
            case Color.BLUE -> "blue";
        };
    }

    public static void main(String[] args) {
        System.out.println(enumObjectSwitch(Color.RED));
        System.out.println(enumObjectSwitch(Color.GREEN));
        System.out.println(enumObjectSwitch(Color.BLUE));
    }
}

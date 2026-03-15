package org.benf.cfr.tests;

public class PatternSwitch4 {

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

    // Boolean type pattern in Object switch
    static String boolObjectSwitch(Object obj) {
        return switch (obj) {
            case Boolean b when b -> "it's true";
            case Boolean b -> "it's false";
            case Integer i -> "int: " + i;
            case String s -> "string: " + s;
            case null, default -> "other";
        };
    }

    // Mixed enum and guards
    static String enumGuardSwitch(Object obj, boolean strict) {
        return switch (obj) {
            case Color.RED -> "red";
            case Color c when strict -> "strict non-red: " + c;
            case Color c -> "non-red: " + c;
            case Integer i when i > 0 -> "positive: " + i;
            case null, default -> "other";
        };
    }

    public static void main(String[] args) {
        System.out.println(enumObjectSwitch(Color.RED));
        System.out.println(enumObjectSwitch(Color.GREEN));
        System.out.println(enumObjectSwitch(Color.BLUE));
        System.out.println(enumObjectSwitch("hello"));
        System.out.println(enumObjectSwitch(null));

        System.out.println(boolObjectSwitch(true));
        System.out.println(boolObjectSwitch(false));
        System.out.println(boolObjectSwitch(42));
        System.out.println(boolObjectSwitch("hi"));

        System.out.println(enumGuardSwitch(Color.RED, true));
        System.out.println(enumGuardSwitch(Color.GREEN, true));
        System.out.println(enumGuardSwitch(Color.BLUE, false));
        System.out.println(enumGuardSwitch(42, false));
    }
}

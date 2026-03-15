package org.benf.cfr.tests;

public class PrimitivePatterns10g {

    static String enumSwitch(Object obj) {
        return switch (obj) {
            case EnumTest1.FOO -> "foo";
            case EnumTest1.BAR -> "bar";
            case EnumTest1 e -> "other enum: " + e;
            default -> "not an enum";
        };
    }

    public static void main(String[] args) {
        System.out.println(enumSwitch(EnumTest1.FOO));
        System.out.println(enumSwitch(EnumTest1.BAR));
        System.out.println(enumSwitch(EnumTest1.BAP));
        System.out.println(enumSwitch("hello"));
    }
}

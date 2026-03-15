package org.benf.cfr.tests;

public class PatternSwitch13 {

    static String enumSwitch(Object obj) {
        return switch (obj) {
            case EnumTest1.FOO -> "foo";
            case EnumTest1.BAP -> "bap";
            case EnumTest1.BAR -> "bar";
            default -> "bar" + obj;
        };
    }

    public static void main(String[] args) {
        System.out.println(enumSwitch(EnumTest1.FOO));
        System.out.println(enumSwitch(EnumTest1.BAR));
        System.out.println(enumSwitch(EnumTest1.BAP));
    }
}

package org.benf.cfr.tests;

public class PatternSwitch12 {

    static String enumSwitch(EnumTest1 obj) {
        return switch (obj) {
            case EnumTest1.FOO -> "foo";
            case BAR -> "bar";
            case EnumTest1 e -> "other enum: " + e;
        };
    }

    public static void main(String[] args) {
        System.out.println(enumSwitch(EnumTest1.FOO));
        System.out.println(enumSwitch(EnumTest1.BAR));
        System.out.println(enumSwitch(EnumTest1.BAP));
    }
}

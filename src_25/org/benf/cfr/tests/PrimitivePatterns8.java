package org.benf.cfr.tests;

public class PrimitivePatterns8 {

    static String boolSwitch(boolean b) {
        return switch (b) {
            case true -> "yes";
            case false -> "no";
        };
    }

    public static void main(String[] args) {
        System.out.println(boolSwitch(true));
        System.out.println(boolSwitch(false));
    }
}

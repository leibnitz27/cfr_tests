
package org.benf.cfr.tests;

class PatternSwitchMarcono1b2 {
    static String enumSwitch(Object obj) {
        return switch (obj) {
            case EnumTest1.FOO -> "foo";
            case EnumTest1.BAR -> "bar";
            case null, default -> "not an enum";
        };
    }
}
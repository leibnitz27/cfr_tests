package org.benf.cfr.tests;

public class PrimitivePatterns10c {

    enum Direction { NORTH, SOUTH, EAST, WEST }

    static String directionSwitch(Object obj) {
        if (obj instanceof Direction d) {
            return switch (d) {
                case Direction.NORTH -> "north";
                case Direction.SOUTH -> "south";
                default -> "other direction: " + d;
            };
        }
        return "nope";
    }

    public static void main(String[] args) {
        System.out.println(directionSwitch(Direction.NORTH));
        System.out.println(directionSwitch(Direction.SOUTH));
        System.out.println(directionSwitch(Direction.EAST));
    }
}

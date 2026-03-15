package org.benf.cfr.tests;

public class PrimitivePatterns10 {

    enum Direction { NORTH, SOUTH, EAST, WEST }

    static String directionSwitch(Object obj) {
        return switch (obj) {
            case Direction.NORTH -> "north";
            case Direction.SOUTH -> "south";
            case Direction d -> "other direction: " + d;
            case null, default -> "not a direction";
        };
    }

    public static void main(String[] args) {
        System.out.println(directionSwitch(Direction.NORTH));
        System.out.println(directionSwitch(Direction.SOUTH));
        System.out.println(directionSwitch(Direction.EAST));
    }
}

package org.benf.cfr.tests;

public class PatternSwitch10 {

    enum Direction { NORTH, SOUTH, EAST, WEST }

    static String directionSwitch(Direction d) {
        return switch (d) {
            case Direction.NORTH -> "north";
            case Direction.SOUTH -> "south";
            default -> "other direction: " + d;
        };
    }

    public static void main(String[] args) {
        System.out.println(directionSwitch(Direction.NORTH));
        System.out.println(directionSwitch(Direction.SOUTH));
        System.out.println(directionSwitch(Direction.EAST));
    }
}

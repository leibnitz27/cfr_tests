package org.benf.cfr.tests;

public class PrimitivePatterns10e {

    enum Direction { NORTH, SOUTH, EAST, WEST }

    static String directionSwitch(Direction d) {
        return switch (d) {
            case NORTH -> "north";
            case SOUTH -> "south";
            default -> "other direction: " + d;
        };
    }

    public static void main(String[] args) {
        System.out.println(directionSwitch(Direction.NORTH));
        System.out.println(directionSwitch(Direction.SOUTH));
        System.out.println(directionSwitch(Direction.EAST));
    }
}

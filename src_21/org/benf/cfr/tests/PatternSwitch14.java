package org.benf.cfr.tests;

public class PatternSwitch14 {

    enum Direction { NORTH, SOUTH, EAST, WEST }

    // Cases in reverse ordinal order
    static String reverseSwitch(Direction d) {
        return switch (d) {
            case Direction.WEST -> "west";
            case Direction.EAST -> "east";
            case Direction.SOUTH -> "south";
            case Direction.NORTH -> "north";
        };
    }

    // Cases with gaps and scrambled order
    static String scrambledSwitch(Direction d) {
        return switch (d) {
            case Direction.EAST -> "east";
            case Direction.NORTH -> "north";
            case Direction.WEST -> "west";
            default -> "other: " + d;
        };
    }

    // All cases but not in ordinal order, unqualified
    static String allScrambled(Direction d) {
        return switch (d) {
            case WEST -> "west";
            case NORTH -> "north";
            case SOUTH -> "south";
            case EAST -> "east";
        };
    }

    public static void main(String[] args) {
        for (Direction d : Direction.values()) {
            System.out.println(reverseSwitch(d));
            System.out.println(scrambledSwitch(d));
            System.out.println(allScrambled(d));
        }
    }
}

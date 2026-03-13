package org.benf.cfr.tests;

public class PrimitivePatterns10f {

    enum Direction { NORTH, SOUTH, EAST, WEST }

    static String directionSwitch(Direction d) {
        switch (d) {
            case NORTH: return "north";
            case SOUTH: return "south";
            default: return "other direction: " + d;
        }
    }

    public static void main(String[] args) {
        System.out.println(directionSwitch(Direction.NORTH));
        System.out.println(directionSwitch(Direction.SOUTH));
        System.out.println(directionSwitch(Direction.EAST));
    }
}

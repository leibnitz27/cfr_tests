package org.benf.cfr.tests;

// Record patterns using external (top-level) records
public class PatternSwitch19 {

    static String describePoint(Object obj) {
        return switch (obj) {
            case RecordPoint21(int x, int y) when x == 0 && y == 0 -> "origin";
            case RecordPoint21(int x, int y) -> "point(" + x + "," + y + ")";
            case null, default -> "other";
        };
    }

    static String describeLine(Object obj) {
        return switch (obj) {
            case RecordLine21(RecordPoint21(int x1, int y1), RecordPoint21(int x2, int y2)) ->
                "line (" + x1 + "," + y1 + ")->(" + x2 + "," + y2 + ")";
            case RecordPoint21(int x, int y) -> "point(" + x + "," + y + ")";
            case null, default -> "other";
        };
    }

    static boolean isOriginLine(Object obj) {
        return obj instanceof RecordLine21(RecordPoint21(int x, int y), RecordPoint21 end) && x == 0 && y == 0;
    }

    public static void main(String[] args) {
        RecordPoint21 origin = new RecordPoint21(0, 0);
        RecordPoint21 p1 = new RecordPoint21(3, 4);
        System.out.println(describePoint(origin));
        System.out.println(describePoint(p1));
        System.out.println(describePoint("hi"));
        System.out.println(describeLine(new RecordLine21(origin, p1)));
        System.out.println(describeLine(p1));
        System.out.println(isOriginLine(new RecordLine21(origin, p1)));
        System.out.println(isOriginLine(new RecordLine21(p1, origin)));
    }
}

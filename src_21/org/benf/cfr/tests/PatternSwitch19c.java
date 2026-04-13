package org.benf.cfr.tests;

// Record patterns using external (top-level) records
public class PatternSwitch19c {
    static String describeLine(Object obj) {
        return switch (obj) {
            case RecordLine21(RecordPoint21(int x1, int y1), RecordPoint21(int x2, int y2)) ->
                "line (" + x1 + "," + y1 + ")->(" + x2 + "," + y2 + ")";
            case null, default -> "other";
        };
    }
}

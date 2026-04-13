package org.benf.cfr.tests;

// Record patterns using external (top-level) records
public class PatternSwitch19b {
    static String describeLine(Object obj) {
        return switch (obj) {
            case RecordLine21(RecordPoint21(int x1, int y1), _) ->
                "line (" + x1 + "," + y1 + ")->(_)";
            case null, default -> "other";
        };
    }
}

package org.benf.cfr.tests;

/*
 * Casts near instanceof that are NOT the pattern's own cast.
 * A rewriter that misidentifies these as pattern variable assignments
 * would change exception semantics — these casts can throw.
 */
public class InstanceOfPatternTest12 {
    // instanceof check on obj, but the cast is on a DIFFERENT object
    public static String test(Object obj, Object other) {
        if (obj instanceof String) {
            String s = (String) other;  // NOT safe — other might not be a String
            return "got: " + s;
        }
        return "not a string";
    }

    // instanceof check on obj, cast on obj but to a DIFFERENT type
    public static String test2(Object obj) {
        if (obj instanceof CharSequence) {
            String s = (String) obj;  // NOT safe — could be StringBuilder
            return "got: " + s;
        }
        return "not a charsequence";
    }

    // Same type cast but with a wrapping try-catch that expects the exception
    public static String test3(Object obj, Object other) {
        try {
            if (obj instanceof String) {
                String s = (String) other;  // other might not be String
                return "cast ok: " + s;
            }
        } catch (ClassCastException e) {
            return "caught: " + e.getClass().getSimpleName();
        }
        return "no match";
    }
}

package org.benf.cfr.tests;

/*
 * Plain instanceof + cast that is NOT a pattern variable, combined with
 * a second condition sharing the same else target.
 * The cast must not be reordered or lifted into the condition.
 *
 * This catches overly aggressive pattern matching that assumes any
 * instanceof + cast + second-if is a pattern variable.
 */
public class InstanceOfPatternTest14 {
    // Plain instanceof with explicit cast, plus a second condition
    // Variable 's' is used outside the inner if.
    public static void test(boolean flag, Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("cast succeeded: " + s);
            if (flag) {
                System.out.println("flag true, length=" + s.length());
            } else {
                System.out.println("flag false");
            }
        } else {
            System.out.println("not a string");
        }
    }

    // Same structure but the cast result is used in the second condition
    public static void test2(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.startsWith("hello")) {
                System.out.println("greeting: " + s);
            } else {
                System.out.println("not a greeting: " + s);
            }
        } else {
            System.out.println("not a string");
        }
    }

    // Mix of pattern and non-pattern in same method
    public static void test3(boolean flag, Object obj) {
        // This one IS a pattern
        if (obj instanceof String s && flag) {
            System.out.println("pattern: " + s.length());
        } else {
            System.out.println("no pattern match");
        }
        // This one is NOT a pattern — explicit instanceof + cast
        if (obj instanceof String) {
            String s2 = (String) obj;
            System.out.println("explicit: " + s2.length());
        }
    }
}

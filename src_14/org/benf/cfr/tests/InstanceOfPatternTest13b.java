package org.benf.cfr.tests;

/*
 * instanceof pattern with side-effecting method calls in the second condition.
 * The assignment (cast) executes between the two conditions — any reordering
 * that moves it after the second condition changes observable behavior.
 */
public class InstanceOfPatternTest13b {
    // Pattern variable where the predicate uses the pattern var
    public static void test2(Object obj) {
        if (obj instanceof String s && s.length() > 3) {
            System.out.println("long string: " + s);
        } else {
            System.out.println("short or not string");
        }
    }
}

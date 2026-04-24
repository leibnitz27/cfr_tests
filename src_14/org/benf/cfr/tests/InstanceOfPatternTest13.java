package org.benf.cfr.tests;

/*
 * instanceof pattern with side-effecting method calls in the second condition.
 * The assignment (cast) executes between the two conditions — any reordering
 * that moves it after the second condition changes observable behavior.
 */
public class InstanceOfPatternTest13 {
    private static int counter = 0;

    private static boolean sideEffect() {
        counter++;
        return counter < 3;
    }

    // Pattern variable with side-effecting predicate
    public static void test(Object obj) {
        if (obj instanceof String s && sideEffect()) {
            System.out.println("matched: " + s + " counter=" + counter);
        } else {
            System.out.println("no match, counter=" + counter);
        }
    }

    // Pattern variable where the predicate uses the pattern var
    public static void test2(Object obj) {
        if (obj instanceof String s && s.length() > 3) {
            System.out.println("long string: " + s);
        } else {
            System.out.println("short or not string");
        }
    }

    // Multiple pattern conditions with side effects between
    public static void test3(Object obj) {
        counter = 0;
        if (obj instanceof String s && sideEffect() && s.length() > 0) {
            System.out.println("all passed: " + s + " counter=" + counter);
        } else {
            System.out.println("failed, counter=" + counter);
        }
    }
}

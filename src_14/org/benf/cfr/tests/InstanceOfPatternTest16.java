package org.benf.cfr.tests;

/*
 * Non-pattern instanceof + cast where the second condition does NOT use
 * the cast result. If the compiler merges else targets, this produces
 * the same bytecode pattern as instanceof pattern matching.
 */
public class InstanceOfPatternTest16 {
    // Second condition (flag) is independent of the cast result
    public static void test(boolean flag, Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (flag) {
                System.out.println("string and flag: " + s);
            }
        }
    }

    // Same but using the cast result after the inner if
    // (prevents else target merging)
    public static void test2(boolean flag, Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (flag) {
                System.out.println("string and flag: " + s);
            }
            System.out.println("was string: " + s);
        }
    }
}

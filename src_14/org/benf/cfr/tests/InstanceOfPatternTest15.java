package org.benf.cfr.tests;

/*
 * Non-pattern instanceof + cast that could match the condenseInstanceOfAssign
 * pattern if the compiler merges both else branches to the same target.
 */
public class InstanceOfPatternTest15 {
    // Plain instanceof + cast + inner condition, no code after inner if.
    // Compiler may generate same ELSE target for both ifs.
    public static void test(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.length() > 5) {
                System.out.println("long string: " + s);
            }
        }
    }

    // Same but with else on outer only
    public static void test2(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.length() > 5) {
                System.out.println("long string: " + s);
            }
        } else {
            System.out.println("not a string");
        }
    }

    // Return in the inner if body — both branches may converge
    public static String test3(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.isEmpty()) {
                return "empty";
            }
        }
        return "other";
    }
}

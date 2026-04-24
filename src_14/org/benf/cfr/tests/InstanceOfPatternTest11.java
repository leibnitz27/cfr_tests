package org.benf.cfr.tests;

/*
 * Plain instanceof + explicit cast where the variable is used AFTER the if block.
 * This must NOT be converted to a pattern variable, because 's' has wider scope.
 */
public class InstanceOfPatternTest11 {
    public static String test(Object obj) {
        String s = "default";
        if (obj instanceof String) {
            s = (String) obj;
        }
        // s is used after the if — it can't be a pattern variable
        return s;
    }

    // Same but with else
    public static String test2(Object obj) {
        String s;
        if (obj instanceof String) {
            s = (String) obj;
        } else {
            s = "fallback";
        }
        return s;
    }
}

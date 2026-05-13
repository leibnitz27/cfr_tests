package org.benf.cfr.tests;

/*
 * Negative test for the absorbed-assignment push-down in
 * InstanceOfMatchCheckTransformer.
 *
 * The user has written an explicit null check around an assignment whose RHS
 * is NOT a cast tied to an instanceof — the null check is doing real work.
 * `maybeString` returns null for non-String inputs, and `s` is used both
 * before the if (for "default") and after.
 *
 * Correct decompilation must preserve the null guard. Naive push-down would
 * produce
 *
 *   if (flag) { s = maybeString(obj); System.out.println(s.length()); }
 *
 * which calls `s.length()` even when `maybeString` returned null — semantic
 * change from the original (and an NPE for null inputs).
 */
public class InstanceOfPatternTest20 {
    static String maybeString(Object o) {
        return o instanceof String ? (String) o : null;
    }

    public static void test(boolean flag, Object obj) {
        String s = "default";
        if (flag && null != (s = maybeString(obj))) {
            System.out.println("got: " + s.length());
        }
        System.out.println("final: " + s);
    }
}

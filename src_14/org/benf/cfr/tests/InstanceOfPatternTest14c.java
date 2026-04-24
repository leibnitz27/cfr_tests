package org.benf.cfr.tests;

public class InstanceOfPatternTest14c {
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

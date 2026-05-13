package org.benf.cfr.tests;

public class InstanceOfPatternTest17 {
    public static void test(Object obj, Object obj2) {
        if (obj instanceof String s && obj2 instanceof Integer i){   //
            System.out.println(s.length() + i);
        }
    }
}

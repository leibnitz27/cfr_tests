package org.benf.cfr.tests;

public class InstanceOfPatternTest18 {
    public static void test(Object obj, Object obj2, Object obj3) {
        if (obj2 instanceof Integer i && obj3 instanceof Long l && i < l && obj instanceof String s){   //
            System.out.println(i + s.length() + l);
        } else {
            System.out.println("Nope");
        }
        System.out.println("Here");
    }
}

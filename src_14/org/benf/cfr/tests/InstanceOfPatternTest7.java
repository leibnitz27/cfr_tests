package org.benf.cfr.tests;

public class InstanceOfPatternTest7 {
    public static void test(Object obj, Object obj2) {

        if (obj instanceof String s && obj2 instanceof String s2){   //
            System.out.println(s + s2);
        } else {
            System.out.println("Foo");
        }
    }
}
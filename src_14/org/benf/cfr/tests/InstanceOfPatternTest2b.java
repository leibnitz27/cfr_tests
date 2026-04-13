package org.benf.cfr.tests;

public class InstanceOfPatternTest2b {
    public static void test(Object obj, Object obj2) {
        //JDK 14
        if (obj instanceof String s && (s.isEmpty() || s.length() < 3) && obj2 instanceof Integer i && i > 5){   //
            System.out.println(s.length());
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}

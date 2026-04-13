package org.benf.cfr.tests;

public class InstanceOfPatternTest2c {
    public static void test(Object obj, Object obj2) {
        //JDK 14
        if (obj instanceof String s && (5 > s.length())){   //
            System.out.println(s.length());
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}

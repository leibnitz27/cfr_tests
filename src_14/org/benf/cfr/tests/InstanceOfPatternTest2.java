package org.benf.cfr.tests;

public class InstanceOfPatternTest2 {
    public static void test(Object obj) {
        //JDK 14
        if (obj instanceof String s){   //

            System.out.println(s.length());
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}
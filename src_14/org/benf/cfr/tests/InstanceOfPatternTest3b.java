package org.benf.cfr.tests;

public class InstanceOfPatternTest3b {
    public static void test(Object obj, Object obj2) {
        //JDK 14
        if (obj instanceof String s){   //

            System.out.println(s.length());
        }

        if (obj2 instanceof String s){   //

            System.out.println(s.length());
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}
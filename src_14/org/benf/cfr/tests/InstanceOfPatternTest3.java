package org.benf.cfr.tests;

public class InstanceOfPatternTest3 {
    public static void test(Object obj) {
        //JDK 14
        if (obj instanceof String s){   //

            System.out.println(s.length());
        }
        if (obj instanceof Integer i){   //

            System.out.println(1 + i);
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}
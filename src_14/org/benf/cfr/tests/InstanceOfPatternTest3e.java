package org.benf.cfr.tests;

public class InstanceOfPatternTest3e {
    public static void test(Object obj, Number obj2) {
        //JDK 14
        if (obj instanceof String s){   //

            System.out.println(s.length());
        }

        if (obj2 instanceof Integer i){   //

            System.out.println(1+i);
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}
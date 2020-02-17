package org.benf.cfr.tests;

public class InstanceOfPatternTest4 {
    public static void test(boolean bool, Object obj) {
        //JDK 14
        if (bool && obj instanceof String s){   //
            System.out.println(s.length());
        } else {
            System.out.println("Foo");
        }

        if (!(!bool || !(obj instanceof String s))){
            System.out.println(s.length());
        } else{
            System.out.println("Bar");
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}
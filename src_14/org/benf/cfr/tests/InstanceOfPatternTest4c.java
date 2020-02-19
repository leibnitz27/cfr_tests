package org.benf.cfr.tests;

public class InstanceOfPatternTest4c {
    public static void test(boolean bool, Object obj) {

        if (obj instanceof String s && bool){   //
            System.out.println(s.length());
        } else {
            System.out.println("Foo");
        }

        if (!(!(obj instanceof String s2) || !bool)){
            System.out.println(s2.length());
        } else{
            System.out.println("Bar");
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}
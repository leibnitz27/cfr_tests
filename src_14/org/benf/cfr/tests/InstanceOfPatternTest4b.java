package org.benf.cfr.tests;

public class InstanceOfPatternTest4b {
    public static void test(boolean bool, Object obj) {

        if (bool && obj instanceof String s){   //
            System.out.println(s.length());
        } else {
            System.out.println("Foo");
        }

        if (!(!bool || !(obj instanceof String s2))){
            System.out.println(s2.length());
        } else{
            System.out.println("Bar");
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}
package org.benf.cfr.tests;

public class InstanceOfPatternTest6 {

    public static void test(boolean bool, Object obj) {
        //JDK 14
        if (!(obj instanceof String s)){
            int s = 1;
            System.out.println(s);
        } else {
            System.out.println(s.length());
        }

        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}
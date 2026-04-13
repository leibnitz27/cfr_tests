package org.benf.cfr.tests;

public class InstanceOfPatternTest2d {
    private static int foo(String s) {
        return s.length() + 5 * 3;
    }

    public static void test(Object obj, Object obj2) {
        //JDK 14
        if (obj instanceof String s && 15 < foo(s)){   //
            System.out.println(s.length());
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}

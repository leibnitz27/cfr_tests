package org.benf.cfr.tests;

public class InstanceOfPatternTest3d {
    public static void test(Object obj, Object obj2) {
        //JDK 14
        String s = null;
        if (obj instanceof String){   //
            s = (String)obj;
            System.out.println(s.length());
        }

        if (obj2 instanceof String){   //
            s = (String)obj2;

            System.out.println(s.length());
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
        System.out.println(s);
    }
}
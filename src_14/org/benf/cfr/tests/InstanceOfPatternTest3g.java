package org.benf.cfr.tests;

public class InstanceOfPatternTest3g {
    public static void test(Object obj) {
        Integer i;
        Object object = obj;
        if (object instanceof String s) {
            System.out.println(s.length());
        }
        if ((object = obj) instanceof Integer && (i = (Integer)object) == (Integer)object) {
            System.out.println(1 + i);
            System.out.println(object);
        }
    }
}
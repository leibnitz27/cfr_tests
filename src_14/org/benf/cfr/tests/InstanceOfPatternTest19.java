package org.benf.cfr.tests;

public class InstanceOfPatternTest19 {
    public static void test(String s, Object obj) {
        System.out.println(s);
        block : {
            if (obj instanceof String) {
                s = (String)obj;
                if (s.length() > 3) break block;
                System.out.println(s);
            }
        }
        System.out.println(s);
        System.out.println("Here");
    }
}

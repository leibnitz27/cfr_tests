package org.benf.cfr.tests;

public class InstanceOfPatternTest19b {
    public static void test(String s1, Object obj) {
        System.out.println(s1);
        block : {
            if (obj instanceof String) {
                String s = (String)obj;
                if (s.length() > 3) break block;
                System.out.println(s);
            }
        }
        System.out.println(s1);
        System.out.println("Here");
    }
}

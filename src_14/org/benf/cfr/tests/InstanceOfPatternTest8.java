package org.benf.cfr.tests;

public class InstanceOfPatternTest8 {
    static String s;
    public static void test(Object obj) {
        if (obj instanceof String s && s.length() > 8){
            System.out.println(s.length());
        }
    }
}
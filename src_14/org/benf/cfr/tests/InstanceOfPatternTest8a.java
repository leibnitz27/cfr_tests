package org.benf.cfr.tests;

public class InstanceOfPatternTest8a {
    static String s = "Fred";

    public static void test(Object obj) {
        if (obj instanceof String s || s.length() > 8){
            System.out.println(s.length());
        }
    }
}
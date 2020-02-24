package org.benf.cfr.tests;

public class InstanceOfPatternTest8_2 {
    static String s = "Fred";
    public static void test(Object obj) {
        if (!(!(obj instanceof String s) || !(s.length() > 8))) {
            System.out.println(s.length());
        }
    }

    public static void main(String ... args) {
        test("foooooooooo");
    }
}
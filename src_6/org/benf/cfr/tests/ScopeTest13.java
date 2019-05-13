package org.benf.cfr.tests;

public class ScopeTest13 {

    static int fred = 12;

    public static void test(char[] chars) {
        System.out.println(fred);
        String fred = "DAMN";
        System.out.println(fred);
        System.out.println(ScopeTest13.fred);
    }

    public static void test(String fred) {
        System.out.println(fred);
        System.out.println(ScopeTest13.fred);
    }
}

package org.benf.cfr.tests;

import java.util.function.Supplier;

public class InstanceOfPatternTest10 {
    static String s = "WIBBLE";

    public static void test(Object obj) {
        if (!(obj instanceof String s)) {
            throw new IllegalStateException();
        }
        System.out.println(s);
    }

    public static void test2(Object obj) {
        if (!(obj instanceof String s)) {
            if(true) {
                throw new IllegalStateException();
            }
        }
        System.out.println(s);
    }

    public static void main(String ... args) {
        test("Fred");
        test2("Fred");
    }
}
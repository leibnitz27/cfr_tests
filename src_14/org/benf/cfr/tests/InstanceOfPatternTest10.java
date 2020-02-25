package org.benf.cfr.tests;

// From a discussion with Tom Johnson
/*
 * In case you don't want to run, as of java (build 14-ea+34-1452)
 * this prints:
 *
 * Fred
 * WIBBLE
 */
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
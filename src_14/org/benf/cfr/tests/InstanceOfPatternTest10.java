package org.benf.cfr.tests;

// From a discussion with Tom Johnson
/*
 * In case you don't want to run, as of java (build 14-ea+34-1452)
 * this prints:
 *
 * Fred
 * WIBBLE
 *
 * (behaviour is due to deliberate code reachability spec
 * https://docs.oracle.com/javase/specs/jls/se7/html/jls-14.html#jls-14.21
 * interacting badly with (IMHO, cough) poorly designed negative match spec
 * for instanceof).
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
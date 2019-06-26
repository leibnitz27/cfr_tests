package org.benf.cfr.tests;

public class UnicodeTest4 {
    public static void foo() {
        System.out.println("\u007f\u00bd\u007e\u00e5\u00a5\u00bd");
    }

    public static void main(String ... args)
    {
        foo();
    }
}

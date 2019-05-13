package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 16/12/2013
 * Time: 22:17
 */
public class UnicodeTest3 {
    public static void foo() {
        System.out.println("你好");
        System.out.println("\u4f60\u597d");
        System.out.println("\u00e4\u00bd\u00a0\u00e5\u00a5\u00bd");
    }

    public static void main(String ... args)
    {
        foo();
    }
}

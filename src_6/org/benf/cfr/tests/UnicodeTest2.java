package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 16/12/2013
 * Time: 22:17
 */
public class UnicodeTest2 {
    public static void foo() {
        System.out.println("\t\n\\u000d");
        System.out.println("\t\n\\ufe0d");
        System.out.println("\t\n\ufe0d");
    }
}

package org.benf.cfr.tests;

// from ovf
public class FieldNameClashTest {
    static String FieldNameClashTest ="hello, world";
    public static void greet(){System.out.println(FieldNameClashTest);}
    public static void main(String[]a){org.benf.cfr.tests.FieldNameClashTest.greet();}
}

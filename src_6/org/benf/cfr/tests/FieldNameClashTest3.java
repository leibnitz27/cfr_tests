package org.benf.cfr.tests;

// from ovf
public class FieldNameClashTest3 {
    static String FieldNameClashTest3 ="hello, world";
    static String FieldNameClashTest ="hello, world";

    FieldNameClashTest3() {
        System.out.println("Here");
    }
    public static void greet(){System.out.println(FieldNameClashTest3);}
    public static void main(String[]a){
        org.benf.cfr.tests.FieldNameClashTest3.greet();
        System.out.println(FieldNameClashTest);
        System.out.println(org.benf.cfr.tests.FieldNameClashTest.FieldNameClashTest);
    }
}

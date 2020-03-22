package org.benf.cfr.tests;

// from ovf
public class FieldNameClashTestPriv {
    private static String FieldNameClashTestPriv ="hello, world";
    public static void greet(){System.out.println(FieldNameClashTestPriv);}
    public static void main(String[]a){
        org.benf.cfr.tests.FieldNameClashTestPriv.greet();}
}

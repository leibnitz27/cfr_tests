package org.benf.cfr.tests;

public class FinalVarTest4 {
    public static final String h1 = "Hello";
    public static final String h2 = "Chap";

    public void thing(){
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h2.equals(h1));
    }
}

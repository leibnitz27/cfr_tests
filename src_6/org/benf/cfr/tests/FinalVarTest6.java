package org.benf.cfr.tests;

public class FinalVarTest6 {
    public static final String h1 = "Hello";
    public static final String h2 = "Chap";

    private class InnerThing {
        public void thing(){
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h2.equals(h1));
        }
    }
}

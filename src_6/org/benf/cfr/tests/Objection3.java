package org.benf.cfr.tests;

// from Abe Crannaford.
public class Objection3 {
    public static int test () {
        Object blah = new Objection3[12];
        int n = ((Objection3[])blah).length;
        // This null assignment provides too much information....
        blah = null;
        blah = "Hello";
        return n;
    }
}

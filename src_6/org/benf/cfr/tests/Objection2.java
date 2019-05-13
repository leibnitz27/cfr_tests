package org.benf.cfr.tests;

// from Abe Crannaford.
public class Objection2 {
    public static int test () {
        Object blah = new byte[12];
        int n = ((byte[])blah).length;
        // This null assignment provides too much information....
        blah = null;
        blah = "Hello";
        return n;
    }
}

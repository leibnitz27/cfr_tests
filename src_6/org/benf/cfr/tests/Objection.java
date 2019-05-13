package org.benf.cfr.tests;

// from Abe Crannaford.
public class Objection {
    public static int test () {
        byte[] blah = new byte[12];
        int n = blah.length;
        // This null assignment provides too much information....
        blah = null;
        return n;
    }
}

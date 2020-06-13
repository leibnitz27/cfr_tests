package org.benf.cfr.tests;

// from Abe Crannaford.
public class Objection3a {
    public static int test (int a) {
        Object blah = new Objection3a[1];
        if (a < 4) {
            blah = new Objection3a[12];
        } else {
            int n = ((Objection3a[])blah).length;
            // This null assignment provides too much information....
            blah = null;
            blah = "Hello" + n;
        }
        return blah.hashCode();
    }
}

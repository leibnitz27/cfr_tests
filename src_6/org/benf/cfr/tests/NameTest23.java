package org.benf.cfr.tests;

/*
 * No name clashes here!
 */
public class NameTest23 {

    public int a;

    public int a() {
        int a = 1;
        return a;
    }

    private class a {

        public int a() {
            return a;
        }
    }
}

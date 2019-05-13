package org.benf.cfr.tests;

class IntWidenTest {

    static int n;
    static Object o;

    public static void main(String[] args) {
        // CFR misses cast
        o = (long)n;
        System.out.println(o.getClass());
        System.out.println(o);
    }

}
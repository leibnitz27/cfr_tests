package org.benf.cfr.tests;

class IntWidenTest2 {

    static int n;
    static Number o;

    public static void main(String[] args) {
        // CFR misses cast
        o = (long)n;
        System.out.println(o.getClass());
        System.out.println(o);
    }

}
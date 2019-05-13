package org.benf.cfr.tests;

class IntWidenTest3 {

    static int n;
    static Long o;

    public static void main(String[] args) {
        // CFR misses cast (Still broken in 137)
        o = (long)n;
        System.out.println(o.getClass());
        System.out.println(o);
    }

}
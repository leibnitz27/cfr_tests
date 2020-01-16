package org.benf.cfr.tests;

class FloatingPointCasting3 {
    private static final Long l = 9223372036854775806L;


    void test() {
        long b = (long) (double) l;
        System.out.println(b == l); // Prints "false"
    }
}
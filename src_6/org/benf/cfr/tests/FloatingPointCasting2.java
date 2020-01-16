package org.benf.cfr.tests;

class FloatingPointCasting2 {
    private static final long l = 9223372036854775806L;


    void test() {
        long b = (long) (double) l;
        System.out.println(b == l); // Prints "false"
    }
}
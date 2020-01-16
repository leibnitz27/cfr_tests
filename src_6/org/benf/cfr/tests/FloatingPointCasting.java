package org.benf.cfr.tests;

class FloatingPointCasting {
    long getLong() {
        return 9223372036854775806L;
    }

    void test() {
        long b = (long) (double) getLong();
        System.out.println(b == getLong()); // Prints "false"
    }
}
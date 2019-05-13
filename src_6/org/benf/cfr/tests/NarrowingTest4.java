package org.benf.cfr.tests;

public class NarrowingTest4 {
    Short x = 3;
    Long y = (long)1;
    long y2 = 1;
    Byte z = 2;
    Integer a = (int)123445678910L;

    public void foo() {
        Short x = 3;
        Long y = (long)1;
        long y2 = 1L;
        Byte z = 2;
        Integer a = (int)123445678910L;
    }

    public void foo2() {
        Long y2 = (long)1;
    }

    public void foo3() {
        Long y2 = 1L;
    }
}

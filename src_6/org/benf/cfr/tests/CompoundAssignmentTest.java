package org.benf.cfr.tests;

public class CompoundAssignmentTest {
    public int test() {
        int i = 0;
        int h = 1;
        i = h & 1;

        return i;
    }

    public int test2() {
        int i = 0;
        i |= 1;

        return i;
    }
}
package org.benf.cfr.tests;

/**
 * User: lee
 * Date: 11/2013
 */
public class InstanceOfTest2 {

    private static class Integer {
    }

    public int test(Object i) {
        if (i instanceof Integer) return 1;
        if (i instanceof java.lang.Integer) return 2;
        if (i instanceof InstanceOfTest1.Integer) return 3;
        return 0;
    }
}

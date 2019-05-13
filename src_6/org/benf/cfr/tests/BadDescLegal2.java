package org.benf.cfr.tests;

/*
 * this is a legal override due to covariance.
 */
public class BadDescLegal2 {
    private static class Base {
        public int fob() {
            return 1;
        }
    }

    private static class D1 extends Base {
        public String foo() {
            return null;
        }
    }
}

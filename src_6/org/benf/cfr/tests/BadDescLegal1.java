package org.benf.cfr.tests;

/*
 * this is a legal override due to covariance.
 */
public class BadDescLegal1 {
    private static class Base {
        public Object foo() {
            return null;
        }
    }

    private static class D1 extends Base {
        public String foo() {
            return null;
        }
    }
}

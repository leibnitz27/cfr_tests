package org.benf.cfr.tests;


class AssertTest17 {

    public static void main(String[] args) {
        AssertTest17 x = new AssertTest17();
        // CFR's assert resugaring is broken by inner class instantiation
        assert(x.new Inner() != null);
    }

    class Inner {
    }

}
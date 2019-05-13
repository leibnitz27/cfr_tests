package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Pair;

public class PairTest1 {

    private static interface Interface {
    }

    private static class Impl1 implements Interface {
    }

    public Pair<String, Interface> test() {
        return new Pair<String, Interface>("Other", new Impl1());
    }

}

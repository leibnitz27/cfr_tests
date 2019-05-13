package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Pair;

public class PairTest3c {

    private static interface Interface {
    }

    private static class Impl1 implements Interface {
    }

    private static class Impl2 implements Interface {
    }

    public Pair<String, Interface> test(boolean a) {
        Pair<String, Interface> res;
        if (a) {
            res = new Pair<String, Interface>("Test", new Impl1());
        } else {
            res = new Pair<String, Interface>("Other", new Impl2());
        }
        return res;
    }

}

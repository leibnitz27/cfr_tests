package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Pair;

public class PairTest2 {

    private static interface Interface {
    }

    private static class Impl1 implements Interface {
    }

    private static class Impl2 implements Interface {
    }

    public Pair<String, Interface> test(boolean a) {
        if (a) {
            System.out.println("Filler");
            return new Pair<String, Interface>("Test", new Impl1());
        }
        return new Pair<String, Interface>("Other", new Impl2());
    }

}

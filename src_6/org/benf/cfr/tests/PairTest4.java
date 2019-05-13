package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Pair;

public class PairTest4 {

    private static interface Interface {
    }

    private static class Impl1 implements Interface {
    }

    private static class FlippedPair<X,Y> extends Pair<Y,X> {
        private FlippedPair(X x, Y y) {
            super(y, x);
        }
    };

    public Pair<String, Interface> test() {
        return new FlippedPair<Interface, String>(new Impl1(), "Other");
    }

}

package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Pair;

public class TypeTest40 {

    public interface Base {
    }

    public static class Instance implements Base {
    }

    public static Pair<Long,Base> func() {
        return new Pair<Long, Base>(3L, new Instance());
    }
}

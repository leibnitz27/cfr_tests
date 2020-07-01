package org.benf.cfr.tests;

import java.util.function.Function;

public class AssertIIFE {
    public int foo(Integer x) {
        assert(((Function<Integer, Boolean>)(x2 -> x2 > 1)).apply(x));
        return x+1;
    }
}

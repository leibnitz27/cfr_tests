package org.benf.cfr.tests;

import java.util.function.IntFunction;

public class LambdaTest40b {
    public static LambdaTest40b[] foo() {
        IntFunction<LambdaTest40b[]> factory = x -> new LambdaTest40b[14];
        return factory.apply(3);
    }
}

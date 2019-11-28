package org.benf.cfr.tests;

import java.util.function.IntFunction;

public class LambdaTest40a {
    public static LambdaTest40a[] foo() {
        IntFunction<LambdaTest40a[]> factory = x -> new  LambdaTest40a[x];
        return factory.apply(3);
    }
}

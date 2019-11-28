package org.benf.cfr.tests;

import java.util.function.IntFunction;

public class LambdaTest40 {
    public static LambdaTest40[] foo() {
        IntFunction<LambdaTest40[]> factory = LambdaTest40[]::new;
        return factory.apply(3);
    }
}

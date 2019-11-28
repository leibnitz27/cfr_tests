package org.benf.cfr.tests;

import java.util.function.IntFunction;

public class LambdaTest39b {
    public static byte[] foo() {
        IntFunction<byte[]> factory = x -> new byte[12];
        return factory.apply(3);
    }
}

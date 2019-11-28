package org.benf.cfr.tests;

import java.util.function.IntFunction;

public class LambdaTest39c {
    public static byte[][] foo() {
        IntFunction<byte[][]> factory = x -> new byte[x][12];
        return factory.apply(3);
    }
}

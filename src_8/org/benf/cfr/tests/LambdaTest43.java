package org.benf.cfr.tests;

import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongToDoubleFunction;

class LambdaTest43 {
    Object use(Function<String, ?> factory) {
        return null;
    }
    Object use(Function<String, ?> factory, int x) {
        return null;
    }

    Object consume(String s) {
        return null;
    }

    void test() {
        use((String s) -> consume(s));
        use((String s) -> consume(s), 2);
    }
}

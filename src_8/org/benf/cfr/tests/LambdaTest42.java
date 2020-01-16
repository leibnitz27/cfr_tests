package org.benf.cfr.tests;

import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongToDoubleFunction;

class LambdaTest42 {
    void use(IntFunction<?> factory) { }
    void use(IntBinaryOperator factory) { }
    void use(DoubleBinaryOperator factory) { }
    void use(LongToDoubleFunction factory) { }
    Object use(Function<String, ?> factory) {
        return null;
    }
    void use(IntFunction<?> factory, int x) { }
    void use(IntBinaryOperator factory, int x) { }
    void use(DoubleBinaryOperator factory, int x) { }
    void use(LongToDoubleFunction factory, int x) { }
    Object use(Function<String, ?> factory, int x) {
        return null;
    }

    int consume(int i, int j) {
        return i;
    }
    double consume(double i, double j) {
        return i;
    }
    Object consume(int i) {
        return null;
    }
    double consume(long i) {
        return i;
    }
    Object consume(String s) {
        return null;
    }

    void test() {
        // Must specify variable types otherwise calls are ambiguous
        use((String s) -> null);
        use((String s) -> consume(s));
        use((int s) -> consume(s));
        use((long s) -> consume(s));
        use((int a, int b) -> consume(a, b));
        use((double a, double b) -> consume(a,b));
        use((String s) -> null, 1);
        use((String s) -> consume(s), 2);
        use((int s) -> consume(s),3);
        use((long s) -> consume(s), 4);
        use((int a, int b) -> consume(a, b), 5);
        use((double a, double b) -> consume(a,b), 6);
    }
}

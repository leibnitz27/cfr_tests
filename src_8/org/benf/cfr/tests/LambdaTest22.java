package org.benf.cfr.tests;

import java.util.stream.Stream;

public class LambdaTest22 {
    public Stream<Integer> foo(Stream<Integer> n) {
        return n.map(x -> x + 1).map(x -> x + 1).map(x -> x + 1);
    }

    public Stream<Integer> foo2(Stream<Integer> s) {
        return s.map(x -> x + 1).map(x -> x + 1).map(x -> x + 1);
    }
}

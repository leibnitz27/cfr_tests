package org.benf.cfr.tests;

import org.benf.cfr.tests.support.SetFactory;

import java.util.Set;
import java.util.stream.Stream;

public class LambdaTest24 {
    public void test(Stream<String> in) {
        Set<String> s = SetFactory.newSet();
        s.getClass();
        Stream<Boolean> numbers = in.map(s::contains);
    }
}

package org.benf.cfr.tests;

import org.benf.cfr.tests.support.SetFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class LambdaTest23 {
    public void test(Stream<String> in) {
        Set<String> s = SetFactory.newSet();
        Stream<Boolean> numbers = in.map(s::contains);
    }
}

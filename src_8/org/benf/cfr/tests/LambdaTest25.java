package org.benf.cfr.tests;

import java.util.stream.Stream;


public class LambdaTest25 {
    public void foo(Stream<String> s) {
        s.getClass();
        s.toArray(x -> new String[x]);
    }
}

package org.benf.cfr.tests;

import java.util.stream.Stream;

// Samuel Dennis Borlongan
public class LambdaTest17 {
    public void foo(Stream<String> s) {
        s.forEach(String::new);
    }
}

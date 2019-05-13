package org.benf.cfr.tests;

import java.util.stream.Stream;

public class LambdaTest30 {
    public static void Main(String ... args) {
          Stream<String> s = Stream.of(args);
          
          s.map(Inner::foo);
    }

    public static class Inner {
        public static String foo(String s) {
            return s;
        }
    }
}

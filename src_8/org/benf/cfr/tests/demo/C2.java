package org.benf.cfr.tests.demo;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

public class C2 {
    public static void main(String ... args) {
//        C1.consume(Arrays::sort, int[]::new);
        (new C1()).foo(null);
    }
}

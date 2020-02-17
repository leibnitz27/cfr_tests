package org.benf.cfr.tests;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class LambdaTest44 {
    final int x = 123;

    public Function<Integer, Integer> test() {
        System.out.println(x);
        return a -> x+a;
    }
}

package org.benf.cfr.tests;

import java.util.Random;
import java.util.function.Function;

public class LambdaTest34 {
    public Function<Integer, Boolean> x(boolean b, int a, int c) {
        return x -> {
            int y;
            if (b) {
                y = a;
            } else {
                System.out.println("foo");
                y = c;
            }
            return y > x;
        };
    }
}

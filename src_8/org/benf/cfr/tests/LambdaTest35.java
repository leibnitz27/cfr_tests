package org.benf.cfr.tests;

import java.util.function.Function;

public class LambdaTest35 {
    public Function<Integer, Boolean> x(boolean b, int a, int c) {
        return x -> {
            Function<Integer, Boolean> f2 = z -> {
                int y;
                if (b) {
                    y = a;
                } else {
                    System.out.println("foo");
                    y = c;
                }
                return y > z;
            };
            return f2.apply(x);
        };
    }
}

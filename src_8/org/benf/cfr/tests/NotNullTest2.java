package org.benf.cfr.tests;

import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;

public class NotNullTest2 {
    private Double d;
    private Integer i;
    private Consumer<String> s;

    public NotNullTest2(Double d, Integer i) {
        this.d = Objects.requireNonNull(d);
        this.i = Objects.requireNonNull(i, "Can't be null");
        s = System.out::println;
        Objects.requireNonNull(new Random().nextInt() % 2 == 0 ? null : "hello");
    }
}

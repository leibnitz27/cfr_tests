package org.benf.cfr.tests;

import java.util.function.Supplier;

public class LambdaTest33 {
    public void benchmark(Supplier<String> supplier) {
        long startTime;
        synchronized(supplier) {
            startTime = System.nanoTime();
        }
        new Thread(() -> {
            System.out.println(startTime);
        }).start();
    }
}

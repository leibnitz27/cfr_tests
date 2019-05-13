package org.benf.cfr.tests;

import java.util.concurrent.ExecutorService;

public class LambdaTest36c {

    private ExecutorService executorService;
    double x;

    public void doThing(final double d) {
        x = d;
        executorService.submit(() -> {
            new Thread(){

                @Override
                public void run() {
                    executorService.submit(() -> {
                        System.out.println("" + x);
                    });
                }
            }.start();
        });
    }
}

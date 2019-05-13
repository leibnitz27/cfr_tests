package org.benf.cfr.tests;

import java.util.concurrent.ExecutorService;

public class LambdaTest36b {

    private ExecutorService executorService;

    public void doThing(final double d) {
        double x = d;
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

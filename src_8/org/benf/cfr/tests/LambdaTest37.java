package org.benf.cfr.tests;

import java.util.concurrent.ExecutorService;

public class LambdaTest37 {

    private ExecutorService executorService;
    double x;

    public void doThing(final double d) {
        x = d;
        // This cast won't compile.  Make sure we don't insert one!
        // executorService.submit(() -> (int)d+ 1);
        executorService.submit(() -> d+ 1);
    }
}

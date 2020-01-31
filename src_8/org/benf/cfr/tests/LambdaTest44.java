package org.benf.cfr.tests;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.ArrayList;

class LambdaTest44 {
    final int x = 123;
    static AtomicInteger count = new AtomicInteger();

    LambdaTest44() {count.incrementAndGet();}

    @Override
    protected void finalize() throws Throwable {
        count.decrementAndGet();
        super.finalize();
    }

    public static Function<Integer, Integer> test() {
        LambdaTest44 tmp = new LambdaTest44();
        return a -> tmp.x+a;
    }

    // java -XX:+UnlockExperimentalVMOptions -XX:+TrustFinalNonStaticFields org.benf.cfr.tests.LambdaTest44
    // (no, it doesn't.  Would be fun)
    public static void main(String ... args) {
        List<Function<Integer, Integer>> l = new ArrayList<>();
        for (int x=0;x<1000000;++x) {
            l.add(test());
        }
        System.gc();
        System.out.println(count);

    }
}

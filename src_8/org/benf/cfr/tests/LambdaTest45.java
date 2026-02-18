package org.benf.cfr.tests;

import java.io.Serializable;
import java.util.function.IntFunction;

class LambdaTest45 {
    private static void doSomething() {}
    private static void doSomethingWithParam(int i) {}

    public static void main(String[] args) throws Exception {
        Runnable r;
        r = (Runnable & Serializable) () -> doSomethingWithParam(0);
        r = (Runnable & Serializable) () -> doSomething();
        r = (Runnable & Serializable) LambdaTest45::doSomething;
        r = (Runnable & Serializable) LambdaTest45::new;

        Object o;
        o = (IntFunction<String[]> & Serializable) String[]::new;
    }
}

package org.benf.cfr.tests;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaUtilities4 {

    public <OBJECT> OBJECT benchmark(Supplier<OBJECT> supplier, long sleepTime) {
        try {
            return null;
        } finally {
            new Thread(() -> {
                try {
                    Thread.sleep(sleepTime);
                } catch (Throwable throwable) {};
            }).start();
        }
    }

}
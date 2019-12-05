package org.benf.cfr.tests;

import java.util.function.Consumer;

public class LambdaTest41 {
    Consumer<?> test1() {
        return (String a) -> {};
    }

    Consumer<?> test2() {
        return a -> {};
    }
}

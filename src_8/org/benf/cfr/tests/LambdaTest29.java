package org.benf.cfr.tests;

import java.util.function.Predicate;

// LAMBDA DEMO
public class LambdaTest29 {

    // MAIN
    public static void main(final String[] args) {

        // a local variable
        final Double d = 10d;

        // a lambda expression
        final Predicate<Double> predicate = p -> p == null;
        final Predicate<Double> predicate2 = p -> p == null;
        final Predicate<Double> predicate3 = p -> p == null;

    }
}
package org.benf.cfr.tests;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.LongStream;

@FunctionalInterface
public interface LambdaUtilities2 {

    public boolean isLoggingEnabled();

    public default <INPUT> Consumer<INPUT> getLogger() {
        return foo(
                System.out::println
        );
    }

    public static <INPUT> Consumer<INPUT> foo(
            Consumer<INPUT> ifTrue
    ) {
        return i -> Optional.empty().get();
    }

}

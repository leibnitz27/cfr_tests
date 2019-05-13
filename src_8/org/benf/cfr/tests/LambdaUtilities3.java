package org.benf.cfr.tests;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

@FunctionalInterface
public interface LambdaUtilities3 {

    public boolean isLoggingEnabled();

    @SafeVarargs
    public static <INPUT> UnaryOperator<INPUT> andThenReturn(Consumer<INPUT>... consumers) {
        return input -> {
            andThen(consumers).accept(input);
            return input;
        };
    }
    @SafeVarargs
    public static <INPUT> Consumer<INPUT> andThen(Consumer<INPUT>... consumers) {
        return Arrays.stream(consumers)
                .parallel()
                .map(LambdaUtilities::proxy)
                .reduce(Consumer::andThen)
                .orElse(nullConsumer())
                ;
    }

    public static <INPUT> Consumer<INPUT> nullConsumer() {
        return i -> {};
    }

}

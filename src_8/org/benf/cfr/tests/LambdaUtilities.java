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
public interface LambdaUtilities {
    public static void main(String... arguments) {
        LambdaUtilities utilities = () -> true;
        utilities.loop(7, () ->
                utilities.benchmark(
                        () -> { // expression statement should be good here!!?
                        utilities.log(
                                nonNull(
                                        Function.identity(),
                                        LambdaRecursiveSupplier::get,
                                        l -> l.get().get(),
                                        l -> l.get().get().get(),
                                        l -> l.get().get().get().get()
                                ).test(
                                        () -> () -> () -> () -> null
                                )
                        );
                        }
                )
        );
    }

    public static final String TIME = "            ";
    public static final String SECONDS = " seconds.";
    public static final ThreadLocal<StringBuilder> BUILDER = ThreadLocal.withInitial(() ->
            new StringBuilder(TIME.length() + SECONDS.length())
                    .append(TIME)
                    .append(SECONDS)
    );

    public boolean isLoggingEnabled();

    public default <INPUT> void log(INPUT input) {
        getLogger().accept(input);
    }

    public default <INPUT> Consumer<INPUT> getLogger() {
        return conditional(
                this::isLoggingEnabled,
                System.out::println,
                nullConsumer()
        );
    }

    public default StringBuilder getBuilder() {
        return BUILDER.get();
    }

    public default void loop(long times, Runnable runnable) {
        LongStream.range(0, times)
                .forEach(l -> runnable.run())
        ;
    }

    public default long benchmark(Runnable runnable) {
        long startTime, endTime;
        synchronized(runnable) {
            startTime = System.nanoTime();
            runnable.run();
            endTime = System.nanoTime();
        }
        long nanoTime = endTime - startTime;
        printNanoTime(nanoTime);
        return nanoTime;
    }

    public default <OBJECT> OBJECT benchmark(Supplier<OBJECT> supplier) {
        return benchmark(supplier, 1000);
    }

    public default <OBJECT> OBJECT benchmark(Supplier<OBJECT> supplier, long sleepTime) {
        long startTime, endTime;
        OBJECT object;
        synchronized(supplier) {
            startTime = System.nanoTime();
            object = supplier.get();
            endTime = System.nanoTime();
        }
        try {
            return object;
        } finally {
            new Thread(() -> {
                try {
                    Thread.sleep(sleepTime);
                } catch (Throwable throwable) {};
                long nanoTime = endTime - startTime;
                printNanoTime(nanoTime);
            }).start();
        }
    }

    public default long printNanoTime(long nanoTime) {
        String time = String.valueOf(nanoTime / 1000000000.0);
        log(
                getBuilder()
                        .replace(0, TIME.length(), TIME)
                        .replace(0, time.length(), time)
        );
        log("");
        return nanoTime;
    }

    @SafeVarargs
    public static <INPUT> Predicate<INPUT> nonNull(Function<INPUT, ?>... functions) {
        return Arrays.stream(functions)
                .parallel()
                .map(f -> (Predicate<INPUT>) i -> Objects.nonNull(f.apply(i)))
                .reduce(Predicate::and)
                .orElse(falsePredicate())
                ;
    }

    public static <INPUT> Consumer<INPUT> nullConsumer() {
        return i -> {};
    }

    public static <INPUT> Consumer<INPUT> delayedConsumer(long milliseconds, TimeUnit timeUnit) {
        return i -> {
            try {
                timeUnit.sleep(milliseconds);
            } catch (Throwable throwable) {}
        };
    }

    public static <INPUT> Consumer<INPUT> delayedConsumer(long milliseconds, TimeUnit timeUnit, Class<INPUT> input) {
        return delayedConsumer(milliseconds, timeUnit);
    }

    public static <INPUT> Predicate<INPUT> falsePredicate() {
        return i -> false;
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

    @SafeVarargs
    public static <INPUT> UnaryOperator<INPUT> andThenReturn(Consumer<INPUT>... consumers) {
        return input -> {
            andThen(consumers).accept(input);
            return input;
        };
    }

    @SafeVarargs
    public static <INPUT, OUTPUT> Function<Object, Object> andThen(Function<Object, Object>... functions) {
        return Arrays.stream(functions)
                .parallel()
                .map(LambdaUtilities::proxy)
                .reduce(Function::andThen)
                .orElse(Function.identity())
                ;
    }

    @SafeVarargs
    public static <INPUT> Predicate<INPUT> and(Predicate<INPUT>... predicates) {
        return Arrays.stream(predicates)
                .parallel()
                .map(LambdaUtilities::proxy)
                .reduce(Predicate::and)
                .orElse(falsePredicate())
                ;
    }

    @SafeVarargs
    public static <INPUT> Predicate<INPUT> or(Predicate<INPUT>... predicates) {
        return Arrays.stream(predicates)
                .parallel()
                .map(LambdaUtilities::proxy)
                .reduce(Predicate::or)
                .orElse(falsePredicate())
                ;
    }

    public static <INPUT1, INPUT2, OUTPUT> BiFunction<INPUT1, INPUT2, OUTPUT> proxy(BiFunction<INPUT1, INPUT2, OUTPUT> biFunction) {
        return biFunction::apply;
    }

    public static <INPUT> Consumer<INPUT> proxy(Consumer<INPUT> consumer) {
        return consumer::accept;
    }

    public static <INPUT, OUTPUT> Function<INPUT, OUTPUT> proxy(Function<INPUT, OUTPUT> function) {
        return function::apply;
    }

    public static <INPUT> Predicate<INPUT> proxy(Predicate<INPUT> predicate) {
        return predicate::test;
    }

    public static <OUTPUT> Supplier<OUTPUT> proxy(Supplier<OUTPUT> supplier) {
        return supplier::get;
    }

    public static <INPUT> Supplier<Optional<Void>> supplier(Consumer<INPUT> consumer, INPUT input) {
        return () -> {
            consumer.accept(input);
            return Optional.empty();
        };
    }

    public static <INPUT, OUTPUT> Supplier<OUTPUT> supplier(Function<INPUT, OUTPUT> function, INPUT input) {
        return () -> function.apply(input);
    }

    public static <INPUT> Supplier<Boolean> supplier(Predicate<INPUT> predicate, INPUT input) {
        return () -> predicate.test(input);
    }

    public static <OUTPUT> Supplier<OUTPUT> supplier(Supplier<OUTPUT> supplier, Object input) {
        return supplier;
    }

    public static <OUTPUT> Supplier<OUTPUT> supplier(Callable<OUTPUT> callable, OUTPUT output) {
        return () -> {
            try {
                return callable.call();
            } catch (Throwable throwable) {
                return output;
            }
        };
    }

    public static <OUTPUT> Supplier<OUTPUT> supplier(Callable<OUTPUT> callable) {
        return supplier(callable, null);
    }

    public static <INPUT> Consumer<INPUT> conditional(
            Predicate<INPUT> condition,
            Consumer<INPUT> ifTrue,
            Consumer<INPUT> ifFalse
    ) {
        return i -> conditional(
                supplier(condition, i),
                supplier(ifTrue, i),
                supplier(ifFalse, i)
        ).get();
    }

    public static <INPUT> Consumer<INPUT> conditional(
            Supplier<Boolean> condition,
            Consumer<INPUT> ifTrue,
            Consumer<INPUT> ifFalse
    ) {
        return i -> conditional(
                supplier(condition, i),
                supplier(ifTrue, i),
                supplier(ifFalse, i)
        ).get();
    }

    public static <INPUT, OUTPUT> Function<INPUT, OUTPUT> conditional(
            Predicate<INPUT> condition,
            Function<INPUT, OUTPUT> ifTrue,
            Function<INPUT, OUTPUT> ifFalse
    ) {
        return i -> conditional(
                supplier(condition, i),
                supplier(ifTrue, i),
                supplier(ifFalse, i)
        ).get();
    }

    public static <INPUT, OUTPUT> Function<INPUT, OUTPUT> conditional(
            Supplier<Boolean> condition,
            Function<INPUT, OUTPUT> ifTrue,
            Function<INPUT, OUTPUT> ifFalse
    ) {
        return i -> conditional(
                supplier(condition, i),
                supplier(ifTrue, i),
                supplier(ifFalse, i)
        ).get();
    }

    public static <INPUT, OUTPUT> Function<INPUT, OUTPUT> conditional(
            Predicate<INPUT> condition,
            Supplier<OUTPUT> ifTrue,
            Supplier<OUTPUT> ifFalse
    ) {
        return i -> conditional(
                supplier(condition, i),
                supplier(ifTrue, i),
                supplier(ifFalse, i)
        ).get();
    }

    public static <INPUT> Predicate<INPUT> conditional(
            Predicate<INPUT> condition,
            Predicate<INPUT> ifTrue,
            Predicate<INPUT> ifFalse
    ) {
        return i -> conditional(
                supplier(condition, i),
                supplier(ifTrue, i),
                supplier(ifFalse, i)
        ).get();
    }

    public static <INPUT> Predicate<INPUT> conditional(
            Supplier<Boolean> condition,
            Predicate<INPUT> ifTrue,
            Predicate<INPUT> ifFalse
    ) {
        return i -> conditional(
                supplier(condition, i),
                supplier(ifTrue, i),
                supplier(ifFalse, i)
        ).get();
    }

    public static <OUTPUT> Supplier<OUTPUT> conditional(
            Supplier<Boolean> condition,
            Supplier<OUTPUT> ifTrue,
            Supplier<OUTPUT> ifFalse
    ) {
        return () -> (condition.get() ? ifTrue : ifFalse).get();
    }
}

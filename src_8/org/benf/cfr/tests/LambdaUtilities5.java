package org.benf.cfr.tests;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.*;
import java.util.stream.LongStream;

import static org.benf.cfr.tests.LambdaUtilities.falsePredicate;

public interface LambdaUtilities5 {
    @SafeVarargs
    public static <INPUT> Predicate<INPUT> nonNull(Function<INPUT, ?>... functions) {
        return Arrays.stream(functions)
                .map(f -> (Predicate<INPUT>) i -> Objects.nonNull(f.apply(i)))
                .reduce(Predicate::and)
                .orElse(falsePredicate())
                ;
    }
}

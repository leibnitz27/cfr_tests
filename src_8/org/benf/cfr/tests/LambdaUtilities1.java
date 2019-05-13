package org.benf.cfr.tests;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.*;
import java.util.stream.LongStream;

@FunctionalInterface
public interface LambdaUtilities1 {

    public static <OUTPUT> Supplier<OUTPUT> conditional(
            Supplier<Boolean> condition,
            Supplier<OUTPUT> ifTrue,
            Supplier<OUTPUT> ifFalse
    ) {
        return () -> (condition.get() ? ifTrue : ifFalse).get();
    }

    public boolean isLoggingEnabled();

}

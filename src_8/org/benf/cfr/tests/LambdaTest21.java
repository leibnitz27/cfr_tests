package org.benf.cfr.tests;


import java.io.Serializable;
import java.util.function.Consumer;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
@FunctionalInterface
public interface LambdaTest21<INPUT> extends Consumer<INPUT>, Serializable {
    public void acceptWithThrowing(INPUT input);

    @Override
    public default void accept(INPUT input) {
    }

    public default LambdaTest21<INPUT> andThen(LambdaTest21<INPUT> consumer) {
        return input -> {
            acceptWithThrowing(input);
        };
    }

    public default LambdaTest21<INPUT> butThen(LambdaTest21<INPUT> consumer) {
        return input -> {
            consumer.acceptWithThrowing(input);
        };
    }

}

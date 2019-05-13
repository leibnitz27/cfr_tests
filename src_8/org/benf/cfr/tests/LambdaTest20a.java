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
public interface LambdaTest20a<INPUT> extends Consumer<INPUT>, MarkerInterface {
    public void acceptWithThrowing(INPUT input) throws Throwable;

    @Override
    public default void accept(INPUT input) {
        try {
            acceptWithThrowing(input);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public default LambdaTest20a<INPUT> andThen(LambdaTest20a<INPUT> consumer) {
        return input -> {
            acceptWithThrowing(input);
            consumer.acceptWithThrowing(input);
        };
    }

}

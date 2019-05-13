package org.benf.cfr.tests;


import org.benf.cfr.tests.support.UnaryFunction;

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
public interface LambdaTest19 <INPUT> extends Consumer<INPUT>, Serializable {
    public void acceptWithThrowing(INPUT input) throws Throwable;

    @Override
    public default void accept(INPUT input) {
        try {
            acceptWithThrowing(input);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}

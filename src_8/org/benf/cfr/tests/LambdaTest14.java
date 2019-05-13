package org.benf.cfr.tests;

import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/08/2013
 * Time: 21:37
 */
public class LambdaTest14 {

    public static <OUTPUT> Supplier<OUTPUT> conditional(
            Supplier<Boolean> condition,
            Supplier<OUTPUT> ifTrue,
            Supplier<OUTPUT> ifFalse
    ) {
        return () -> (condition.get() ? ifTrue : ifFalse).get();
    }
}

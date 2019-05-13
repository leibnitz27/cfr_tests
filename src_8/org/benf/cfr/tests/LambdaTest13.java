package org.benf.cfr.tests;


import org.benf.cfr.tests.support.SetFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class LambdaTest13 {

    static <T,R> List<R> map(Function<T,R> function, List<T> source) {
        List<R> destiny = create(ArrayList<R>::new);
        for (T item : source) {
            R value = function.apply(item);
            destiny.add(value);
        }
        return destiny;
    }

    public static <V> V create(final Supplier<V> factory) {
        return factory.get();
    }
}

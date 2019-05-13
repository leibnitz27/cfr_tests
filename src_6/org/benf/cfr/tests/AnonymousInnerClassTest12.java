package org.benf.cfr.tests;


import org.benf.cfr.tests.support.UnaryFunction;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/04/2013
 * Time: 17:49
 */
public class AnonymousInnerClassTest12 {

    public static Object test(final int x) {
        Object t = new UnaryFunction<Integer, Integer>() {

            @Override
            public Integer invoke(Integer arg) {
                return arg * x;
            }
        };
        return t;
    }
}

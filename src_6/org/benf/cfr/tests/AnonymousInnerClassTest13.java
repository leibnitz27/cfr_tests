package org.benf.cfr.tests;


import org.benf.cfr.tests.support.UnaryFunction;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/04/2013
 * Time: 17:49
 */
public class AnonymousInnerClassTest13 {

    public static Object test(final int x) {
        Object t = new UnaryFunction<Integer, Integer>() {

            @Override
            public Integer invoke(Integer arg) {
                int t = arg * x;
                int t2 = t+t;
                return arg + x * t + t2;
            }
        };
        return t;
    }
}

package org.benf.cfr.tests;


import org.benf.cfr.tests.support.UnaryFunction;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/04/2013
 * Time: 17:49
 */
public class AnonymousInnerClassTest15 {

    private static class Priv {
        private int x;
        public Priv(int x) {
            this.x =x;
        }
    }

    public static Object test(int x) {
        Priv p = new Priv(x);
        return new UnaryFunction<Priv, Integer>() {
            @Override
            public Integer invoke(Priv arg) {
                return arg.x;
            }
        }.invoke(p);
    }
}

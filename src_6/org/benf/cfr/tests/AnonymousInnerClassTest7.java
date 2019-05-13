package org.benf.cfr.tests;


import org.benf.cfr.tests.support.UnaryFunction;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/04/2013
 * Time: 17:49
 */
public class AnonymousInnerClassTest7 {

    Integer invoker(int arg, Inner1 fn) {
        return fn.invoke(arg);
    }

    public int doit(final Integer x, Integer y) {
        return invoker(x, new Inner1(y+3) {

            @Override
            public Integer invoke(Integer arg) {
                return arg * 3 + x + a;
            }
        });
    }

    private abstract static class Inner1 {
        protected int a;

        protected Inner1(int a) {
            this.a = a;
        }

        public abstract Integer invoke(Integer arg);
    }
}

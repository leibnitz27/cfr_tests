package org.benf.cfr.tests;


/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/04/2013
 * Time: 17:49
 */
public class AnonymousInnerClassTest8 {

    Integer invoker(int arg, Inner1 fn) {
        return fn.invoke(arg);
    }

    public int doit(final Integer x, Integer y) {
        return invoker(x, new Inner1() {

            @Override
            public Integer invoke(Integer arg) {
                return arg * 3 + x + a;
            }
        });
    }

    private abstract static class Inner1 {
        protected int a;

        protected Inner1() {
            this.a = 3;
        }

        public abstract Integer invoke(Integer arg);
    }
}

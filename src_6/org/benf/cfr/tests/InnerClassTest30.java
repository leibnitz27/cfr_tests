package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest30 {

    public static interface I {
        Object get(Object o);
    }

    public static class C implements I {
        /*
         * Override with covariant return type.
         */
        @Override
        public Double get(Object o) {
            return 2.0;
        }
    }

}

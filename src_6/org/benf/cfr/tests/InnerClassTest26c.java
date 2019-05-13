package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest26c {
    public Predicate<Double> foo(int i) {
        if (i < 3) {
            class Bob implements Predicate<Double> {
                @Override
                public boolean test(Double in) {
                    return false;
                }
            }
            return new Bob();
        }

        class Bob implements Predicate<Double> {
            @Override
            public boolean test(Double in) {
                return true;
            }
        }
        return new Bob();
    }
}

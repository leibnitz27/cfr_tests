package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest25 {
    int y;

    public Predicate<Double> foo(int i) {
        int x = 1;
        if (x < 3) {
            class Bob implements Predicate<Double> {
                @Override
                public boolean test(Double in) {
                    return in < y;
                }
            }
            return new Bob();
        } else {
            if (x > 5) {
                return null;
            } else {
                class Bob implements Predicate<Double> {
                    @Override
                    public boolean test(Double in) {
                        return in > y;
                    }
                }
                return new Bob();
            }
        }
    }
}

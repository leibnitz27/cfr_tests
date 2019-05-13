package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest26 {
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
                final int j = x+3;
                class Bob implements Predicate<Double> {
                    @Override
                    public boolean test(Double in) {
                        return in == j;
                    }
                }
                return new Bob();
            } else {
                final int j = x+30;
                class Bob implements Predicate<Double> {
                    @Override
                    public boolean test(Double in) {
                        return in+j > y;
                    }
                }
                return new Bob();
            }
        }
    }
}

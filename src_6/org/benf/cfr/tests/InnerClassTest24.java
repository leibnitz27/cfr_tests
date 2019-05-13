package org.benf.cfr.tests;

import org.benf.cfr.tests.support.BinaryFunction;
import org.benf.cfr.tests.support.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest24 {
    int y;

    public Predicate<Double> foo(int i) {
        class Bob implements Predicate<Double> {
            @Override
            public boolean test(Double in) {
                return in < y;
            }
        }
        int x = 1;
        if (x < 3) {
            return new Bob();
        } else {
            if (x > 5) {
                return null;
            } else {
                return new Bob();
            }
        }
    }
}

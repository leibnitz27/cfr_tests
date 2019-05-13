package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Predicate;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/09/2013
 * Time: 07:37
 */
public class TypeTest35 {
    public int foo(int i) {
        int x = 1;
        if (x < 3) {
            return 1;
        } else {
            if (x > 5) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}

package org.benf.cfr.tests;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest32 {

    void test(Object i) {
    }

    private void t(String i, Set<Integer> s) {
        s.add(Integer.parseInt(i));
    }
}

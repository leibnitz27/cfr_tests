package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest14 {
    private void test(Object o) {
    }

    private void test(int i) {
    }


    private void t(int x) {
        test(Integer.valueOf(x));
        test(x);
    }
}

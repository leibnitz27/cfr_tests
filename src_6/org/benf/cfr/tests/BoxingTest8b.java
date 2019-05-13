package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest8b {

    private boolean t(Integer k, Integer n, int i) {
        System.out.println(k);
        foo(n);
        foo(i);
        return false;
    }

    private void foo(Object i) {
    }

    private void foo(Number i) {
    }

    private void foo(int i) {
    }

}

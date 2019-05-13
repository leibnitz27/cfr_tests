package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest13 {
    private void t(Integer v, Integer v2) {
        if (v == v2) throw new IllegalStateException();
        System.out.println("A");
    }

    private void t2(Integer v, Integer v2) {
        if (v == (int)v2) throw new IllegalStateException();
        System.out.println("A");
    }

    private void t(int v, Integer v2) {
        if (v != v2) throw new IllegalStateException();
        System.out.println("A");
    }

}

package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest12 {
    private void t(Integer v, Integer[] is) {
        for (Integer i : is) {
            if (i == v) throw new IllegalStateException();
            System.out.println("A");
        }
    }

    private void t(int v, Integer[] is) {
        for (Integer i : is) {
            if (i == v) throw new IllegalStateException();
            System.out.println("A");
        }
    }

}

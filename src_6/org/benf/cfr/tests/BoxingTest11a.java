package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest11a {


    private void t(int v, List<Integer> is) {
        for (Integer i : is) {
            if (i == v) throw new IllegalStateException();
            i++;
            System.out.println("A");
        }
    }

}

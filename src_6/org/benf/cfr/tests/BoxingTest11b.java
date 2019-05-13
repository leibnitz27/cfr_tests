package org.benf.cfr.tests;

import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest11b {


    private void t(int v, List<Integer> is) {
        System.out.println("here");
        Iterator<Integer> i$ = is.iterator();
        do {
            if (i$.hasNext() == false)
            {
                return;
            }
            Integer i = i$.next();
            if (i == v) {
                throw new IllegalStateException();
            }
            System.out.println("A");
        } while (true);
    }

}

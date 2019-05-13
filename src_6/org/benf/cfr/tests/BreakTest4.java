package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/07/2013
 * Time: 14:56
 */
public class BreakTest4 {

    public int doIt(List<Integer> as, List<Integer> bs) {
        for (int a : as) {
            System.out.println(bs.contains(a));
        }
        return 1;
    }
}

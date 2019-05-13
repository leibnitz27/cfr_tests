package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/07/2013
 * Time: 14:56
 */
public class BreakTest3 {

    public int doIt(List<Integer> as, List<Integer> bs) {
        a : {
            System.out.println("A");
        b : {
            System.out.println("B");
        c : {
            System.out.println("C");
        d : {
            System.out.println("D");
            if (as.size() >  bs.size()) break d;
            if (as.size() >= bs.size()) break c;
            if (as.size() >= bs.size()) break b;
            System.out.println("E");
        }
            System.out.println("F");
        }
            System.out.println("G");
        }
            System.out.println("H");
        }
        return 1;
    }
}

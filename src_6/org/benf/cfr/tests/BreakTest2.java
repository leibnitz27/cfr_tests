package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/07/2013
 * Time: 14:56
 */
public class BreakTest2 {

    boolean testA(int a, int b) {
        return a<b;
    }

    boolean testB(int a, int b) {
        return a<b;
    }

    boolean testC(int a, int b) {
        return a<b;
    }

    public int doIt(List<Integer> as, List<Integer> bs) {
        a :  for (Integer a : as) {
            b :for (Integer b : bs) {
                System.out.println("A");
                if (b==a) break a;
                System.out.println("B");
                if (b>a) break b;
                System.out.println("C");
            }
        }
        return 1;
    }
}

package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/07/2013
 * Time: 14:56
 */
public class BreakTest5 {

    public int doIt(List<Integer> as, List<Integer> bs) {
        int x = 1;
        do {
            if (x > 200) break;
            System.out.println(x);
            if (x % 5 == 0) {
                x++;
            } else {
                x+=5;
            }
        } while (true);
        return 1;
    }
}

package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest40c {

    public void test(int [] xs)
    {
        for (int y=0;y<12;++y) {
        int[] arr$ = xs;
        int len$ = arr$.length;
        int i$ = 0;
        do {
            if (i$ >= len$) {
                return;
            }
            int x = arr$[i$];
            // Breaks procyon 5.13.
            if ((i$ = x) == 12) break;
            System.out.println(x);
            ++i$;
        } while (true);
        System.out.println("Fred");
        for (int x=0;x<12;++x) {
            System.out.println("x");
        }
        }
    }
}

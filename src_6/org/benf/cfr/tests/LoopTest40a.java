package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest40a {

    public void test(int [] xs)
    {
        int[] arr$ = xs;
        int len$ = arr$.length;
        int i$ = 0;
        do {
            if (i$ >= len$) {
                break;
            }
            int x = arr$[i$];
            System.out.println(x);
            ++i$;
        } while (true);
    }
}

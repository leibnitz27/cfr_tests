package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ArrayTest3a {
    int x;
    int y;
    int z;

    void test1(int a, int b) {
        String[] tmp;
        String[] arr$ = (tmp = new String[]{"a", "b", "c"});
        int len$ = arr$.length;
        int i$ = 0;
        do {
            if (i$ >= len$) return;
            String s = arr$[i$];
            System.out.println(s);
            ++i$;
        } while (true);
    }

}

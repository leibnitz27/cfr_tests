package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest20a {

    int y;

    public void test1(int [] as) {
        int $i = 93;
        int i$ = 94;
        for (int x : as) {
            System.out.println(i$);
            System.out.println($i + x);
        }
    }
}

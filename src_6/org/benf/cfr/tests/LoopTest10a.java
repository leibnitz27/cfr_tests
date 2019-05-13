package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest10a {

    public void test(int end) {
        int c = 0;
        while (++c < end || ++c < end) {
            System.out.println(":" + c);
        }
    }
}

package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/02/2013
 * Time: 17:44
 */

public class AssignTest17 {
    public void test(int y) {
        int x = y+2;
        int z = x;
        int a = z+1;
        if (a > 3) z = 2;
        System.out.print(""  + a + x + "" + z);
    }
}

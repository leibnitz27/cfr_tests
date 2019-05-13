package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ArrayTest4b {
    int x;
    int y;
    int z;

    void test1(int a, int b) {
        String[] tmp = new String[]{"a", "b", "c"};
        String[][] tmp2 = new String[][]{tmp, tmp, {"a"}};
        test2(tmp);
        test2(new String[]{"a"});
    }

    void test2(String [] x) {

    }

}

package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ArrayTest4c {
    int x;
    int y;
    int z;

    void test1(int a, int b) {
        String[] tmp = new String[]{"a", "b", "c"};
        Object[] tmp2 = new String[]{"a", "b"};
        test2(tmp);
        test2(tmp2);
        test2((Object[])tmp);
        test2(new String[]{"a"});
        test2(new Object[]{"a"});
    }

    void test2(Object [] x) {

    }

    void test2(String [] x) {

    }
}

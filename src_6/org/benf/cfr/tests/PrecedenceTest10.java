package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/02/2014
 * Time: 17:56
 */
public class PrecedenceTest10 {

    public int test1(int x, int y, int z) {
        return x * y * z;
    }

    public int test2(int x, int y, int z) {
        return x * (y * z);
    }

    public int test3(int x, int y, int z) {
        return (x * y) * z;
    }

}

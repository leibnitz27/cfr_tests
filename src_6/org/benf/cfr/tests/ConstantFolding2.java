package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class ConstantFolding2 {
    public int test1() {
        return 1 + 2 + 3 + 4 + 5 + 6;
    }

    public int test2() {
        return 1 + 2 + 3 + 4 + 5 + 6 / 0;
    }

    public static void main(String ... args) {
        System.out.println(new ConstantFolding2().test2());
    }
}

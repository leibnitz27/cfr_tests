package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/02/2014
 * Time: 17:56
 */
public class PrecedenceTest2 {
    public int test1(int a, int b, int c) {
        return a+b*c;
    }

    public int test2(int a, int b, int c) {
        return (a+b)*c;
    }
}

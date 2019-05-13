package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/02/2014
 * Time: 17:56
 */
public class PrecedenceTest5 {

    public int test1(boolean a, int b, int c) {
        return a ? b+c : b*c;
    }
}

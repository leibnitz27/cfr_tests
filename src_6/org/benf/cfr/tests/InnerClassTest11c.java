package org.benf.cfr.tests;


/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class InnerClassTest11c {
    private int a;

    public class Inner1 {
        public Inner1(int x) {
            a /= x;
        }
    }
}

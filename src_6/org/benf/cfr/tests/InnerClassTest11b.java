package org.benf.cfr.tests;


import org.benf.cfr.tests.support.SetFactory;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class InnerClassTest11b {
    private int a;

    public void foo() {
        Inner1 i = new Inner1(5);
    }

    public class Inner1 {
        public Inner1(int x) {
            a += x;
            a *= x;
            a /= x;
            a -= x;
            a %= x;
            a ^= x;
            a = a % 3;
            a = a / 3;
        }
    }
}
